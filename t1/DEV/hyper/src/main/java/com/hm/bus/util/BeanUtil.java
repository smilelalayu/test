package com.hm.bus.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Maps;


/**
 *
 * ClassName: BeanUtil <br/>
 * Function: 实体bean工具类 <br/>
 * Reason: <br/>
 * date: 2016年4月15日 下午2:41:32 <br/>
 *
 * @author hanyongshun
 * @version
 * @since JDK 1.7
 */
public class BeanUtil extends PropertyUtils {

    private static final Logger logger = LoggerFactory.getLogger(BeanUtil.class);

    /**
     * override BeanUtils method copyProperties, support not copy null or blank
     * property
     *
     * @param dest
     * @param src
     */
    public static void copyProperties(Object dest, Object src) {
        // 为两个参数时，skipNull 默认为true
        copyProperties(dest, src, true);
    }

    /**
     * override BeanUtils method copyProperties, support not copy null or blank
     * property
     *
     * @param dest
     * @param src
     * @param skipNull
     */
    public static void copyProperties(Object dest, Object src, boolean skipNull) {
        // Validate existence of the specified beans
        if (dest == null) {
            throw new IllegalArgumentException("No destination bean specified");
        }

        if (src == null) {
            throw new IllegalArgumentException("No origin bean specified");
        }
        // 获取所有src中的属性，存入于数组中
        PropertyDescriptor[] origDescriptors = PropertyUtils.getPropertyDescriptors(src);

        for (int i = 0; i < origDescriptors.length; i++) {
            // 取出src中属性名
            String name = origDescriptors[i].getName();

            if ("class".equals(name)) {
                continue; // No point in trying to set an object's class
            }

            //if (PropertyUtils.isReadable(src, name) && PropertyUtils.isWriteable(dest, name)) {

                Object value = null;
                try {
                    // 取出属性的值
                    value = PropertyUtils.getSimpleProperty(src, name);

                } catch (Exception e) {
                    throw new RuntimeException();
                }

                if (skipNull) {
                    if (value == null) {
                        continue;
                    }
                } else if (value == null) {
                    value = null;
                }

                try {

                    setProperty(dest, name, value);

                } catch (NoSuchMethodException e){

                }catch (IllegalAccessException e) {
                    throw new RuntimeException();
                }catch (InvocationTargetException e){
                    throw new RuntimeException();
                }
           //}
        }
    }

    /**
     * 将实体映射成Map
     **/
    public static Map<String, Object> bean2Map(Object obj, boolean isWriteBlank) {

        if (obj == null) {
            return null;
        }
        Map<String, Object> map = Maps.newHashMap();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();

                // 过滤class属性
                if (!key.equals("class")) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(obj);
                    if (StringUtil.isNotNull(value)) {
                        map.put(key, value);
                    } else {
                        if (isWriteBlank) {
                            map.put(key, "");
                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.error("" + e);
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 将实体映射成Map
     **/
    public static Map<String, Object> bean2Map(Object obj) {

        if (obj == null) {
            return null;
        }
        Map<String, Object> map = Maps.newHashMap();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();

                // 过滤class属性
                if (!key.equals("class")) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(obj);
                    if (StringUtil.isNotNull(value)) {
                        map.put(key, value);
                    } else {
                        map.put(key, "");
                    }
                }
            }
        } catch (Exception e) {
            logger.error("" + e);
            e.printStackTrace();
        }
        return map;
    }

    /**
     *
     * FunctionName:转换
     *
     * @author hanhys
     * @since JDK 1.7
     * @param
     * @param map
     * @return
     * @throws Exception
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static <T> T map2Bean(Class<?> clazz, Map map) throws Exception {
        // 实例化类
        T entity = (T) clazz.newInstance();
        Set<String> keys = map.keySet();
        // 变量map 赋值
        for (String key : keys) {
            String fieldName = key;
            // 判断是sql 还是hql返回的结果
            if (key.equals(key.toUpperCase())) {
                // 获取所有域变量
                Field[] fields = clazz.getDeclaredFields();
                for (Field field : fields) {
                    if (field.getName().toUpperCase().equals(key)) {
                        fieldName = field.getName();
                    }
                    break;
                }
            }
            // 设置赋值
            try {
                // 参数的类型 clazz.getField(fieldName)
                Class<?> paramClass = clazz.getDeclaredField(fieldName).getType();
                // 拼装set方法名称
                String methodName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                // 根据名称获取方法
                Method method = clazz.getMethod(methodName, paramClass);
                // 调用invoke执行赋值
                method.invoke(entity, map.get(key));
            } catch (Exception e) {
                // NoSuchMethod
            }
        }

        return entity;
    }

    /**
     * 反射调用指定构造方法创建对象
     *
     * @param clazz
     *            对象类型
     * @param argTypes
     *            参数类型
     * @param args
     *            构造参数
     * @return 返回构造后的对象
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     * @throws InstantiationException
     *
     */
    public static <T> T invokeConstructor(Class<T> clazz, Class<?>[] argTypes, Object[] args)
            throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Constructor<T> constructor = clazz.getConstructor(argTypes);
        return constructor.newInstance(args);
    }

    /**
     * 反射调用指定对象属性的getter方法
     *
     * @param <T>
     *            泛型
     * @param target
     *            指定对象
     * @param fieldName
     *            属性名
     * @return 返回调用后的值
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     *
     */
    public static <T> Object invokeGetter(T target, String fieldName)
            throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // 如果属性名为xxx，则方法名为getXxx
        String methodName = "get" + StringUtil.firstCharUpperCase(fieldName);
        Method method = target.getClass().getMethod(methodName);
        return method.invoke(target);
    }

    /**
     * 反射调用指定对象属性的setter方法
     *
     * @param <T>
     *            泛型
     * @param target
     *            指定对象
     * @param fieldName
     *            属性名
     * @param args
     *            参数列表
     * @throws SecurityException
     * @throws NoSuchFieldException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     *
     */
    public static <T> void invokeSetter(T target, String fieldName, Object args)
            throws NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // 如果属性名为xxx，则方法名为setXxx
        String methodName = "set" + StringUtil.firstCharUpperCase(fieldName);
        Class<?> clazz = target.getClass();
        Field field = clazz.getDeclaredField(fieldName);
        Method method = clazz.getMethod(methodName, field.getType());
        method.invoke(target, args);
    }
}
