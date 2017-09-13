//package com.hm.bus.service.impl;
//
//import com.hm.bus.service.RedisService;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
///**
// * @author liujie
// * @date 2017/1/13
// * @time 16:28
// * @desc
// */
//@Service
//public class RedisServiceImpl implements RedisService {
//
//    private static final Logger log = Logger.getLogger(RedisServiceImpl.class);
//
//    @Autowired
//    private RedisTemplate<String, String> redisTemplate;
//
//    /**
//     * 从 尾部删除一个元素，并返回删除的元素
//     * @param queueKey
//     * @return
//     */
//    public String poll(String queueKey) {
//        String val =redisTemplate.opsForList().rightPop(queueKey, 0, TimeUnit.SECONDS);
//        log.info("hm RedisQueue poll:"+val);
//        return val;
//    }

//
//    /**
//     * 循环插入元数
//     * @param queueKey
//     * @param lists
//     */
//    @Override
//    public void publishList(String queueKey, List<String> lists) {
//        for (String str : lists) {
//            redisTemplate.opsForList().leftPush(queueKey, str);
//        }
//    }
//
//    @Override
//    public String get(String key, String hashKey) {
//        Object obj = redisTemplate.opsForHash().get(key, hashKey);
//        if(obj==null) {
//            return "";
//        }
//        return obj.toString();
//    }
//
//    @Override
//    public void clean(String key) {
//        try{
//            redisTemplate.delete(key);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void putAll(String table, Map<String, Object> map) {
//        try{
//            redisTemplate.opsForHash().putAll(table, map);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public Long listSize(String key) {
//        try{
//            return redisTemplate.opsForList().size(key);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}
