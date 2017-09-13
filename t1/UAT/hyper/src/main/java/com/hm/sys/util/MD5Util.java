package com.hm.sys.util;

import java.security.MessageDigest;

public class MD5Util {  
    /***
     * MD5加密
     * 描述：<br/>
     * @param plainText
     * @return
     * @throws Exception
     */
    public static String getEncryptedPwd(String plainText)throws Exception {
        StringBuffer buf = new StringBuffer("");
        try {
            // 生成实现指定摘要算法的 MessageDigest 对象。
            MessageDigest md = MessageDigest.getInstance("MD5"); // 使用指定的字节数组更新摘要。
            md.update(plainText.getBytes()); // 通过执行诸如填充之类的最终操作完成哈希计算。
            byte b[] = md.digest(); // 生成具体的md5密码到buf数组
            int i;
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buf.toString().toUpperCase();
    }
    public static void main(String[] args)
        throws Exception {
        System.out.println(getEncryptedPwd("111111"));
    }
}
