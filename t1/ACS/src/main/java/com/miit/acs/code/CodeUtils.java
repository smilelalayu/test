package com.miit.acs.code;

import java.security.MessageDigest;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;


import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class CodeUtils {

	public static String getMD5Value(byte[] bytes) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			// System.out.println(messageDigest.getProvider().getInfo());

			messageDigest.update(bytes);

			return new String(messageDigest.digest(), "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	public static String getMD5Value(String content) {
		if (content == null) {
			return null;
		}
		return getMD5Value(content.getBytes());
	}

	/**
	 * 解密 以String密文输入,String明文输出
	 * 
	 * @param strMi
	 *            加密后的字符串
	 * @param strKey
	 *            加密用的Key
	 * @return 揭秘后的字符串
	 */
	public static String getDesString(String strMi, String strKey) {
		String strMing = "";
		final String CIPHER_MODE = "AES/CBC/NoPadding";
		try {

			SecretKeySpec key = new SecretKeySpec(strKey.getBytes(), "AES");
			IvParameterSpec iv = new IvParameterSpec(strKey.getBytes());

			Cipher cipher = Cipher.getInstance(CIPHER_MODE);
			cipher.init(Cipher.DECRYPT_MODE, key, iv);
			byte[] bs = cipher.doFinal(Base64.decode(strMi));
			strMing = new String(bs, "UTF8");

			int len = Integer.parseInt(strMing.substring(0, 2));
			strMing = strMing.substring(2, len + 2);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return strMing;

	}

	public static void main(String[] args) {
		String s = "1233333333322222";
		String encode = Base64.encode(s.getBytes());
	

	
	}
}
