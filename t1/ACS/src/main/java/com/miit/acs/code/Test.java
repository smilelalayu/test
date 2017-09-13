package com.miit.acs.code;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

/**
 * @author zhaosen
 * 
 *         测试java 加密，解密api
 * 
 * 
 *         DES（Data Encryption Standard）：对称算法，数据加密标准，速度较快，适用于加密大量数据的场合
 * 
 *         RSA：由 RSA 公司发明，是一个支持变长密钥的公共密钥算法，需要加密的文件块的长度也是可变的，非对称算法；
 *         是Rivest、Shamir和Adleman提出来的基于数论非对称性(公开钥)加密算法。大整数的素因子难分解是RSA算法的基础。
 * 
 *         AES（Advanced Encryption
 *         Standard）：高级加密标准，对称算法，是下一代的加密算法标准，速度快，安全级别高，现在 AES 标准的一个实现是 Rijndael
 *         算法； AES加密是美国国家标准技术研究院制定的面向全球的加密算法， 基本算是现在最先进的加密算法。
 * 		   256位的情况下用暴力穷尽破解，世界上最强大的计算机也要一百多亿年。
 * 
 *         DSA（Digital Signature Algorithm）：数字签名算法，是一种标准的
 *         DSS（数字签名标准），严格来说不算加密算法；
 * 
 * 
 * 
 */
public class Test {

	// public static void main(String[] args) throws Exception{
	// if(args.length!=1){
	// System.err.println("Usage:java MessageDigestExample text");
	// System.exit(1);
	// }
	// byte[] plainText=args[0].getBytes("UTF8");
	// 使用getInstance("算法")来获得消息摘要,这里使用SHA-1的160位算法
	// MessageDigest messageDigest=MessageDigest.getInstance("SHA-1");
	// System.out.println(" "+messageDigest.getProvider().getInfo());
	// 开始使用算法
	// messageDigest.update(plainText);
	// System.out.println(" Digest:");
	// 输出算法运算结果
	// System.out.println(new String(messageDigest.digest(),"UTF-8"));
	// }

	public static void main(String args[]) {
		// privateCode("安全测试：aa");
		// publicCode("安全测试：aa");
		// DigitalSignature("安全测试：aa");

		singleCode("aaa");
	}

	/**
	 * @param content
	 * 
	 *            散列值，验证一直性
	 */
	private static void singleCode(String content) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			System.out.println(messageDigest.getProvider().getInfo());

			messageDigest.update(content.getBytes("UTF8"));
			// messageDigest.update(content.getBytes("UTF8"));

			System.out.println(" Digest:");
			// 输出算法运算结果
			System.out.println(new String(messageDigest.digest(), "UTF-8"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param content
	 * 
	 *            私鈅加密，解密
	 */
	private static void privateCode(String content) {
		// 通过KeyGenerator形成一个key
		try {
			byte[] plainText = content.getBytes("UTF8");
			System.out.println(" Start generate AES key");
			KeyGenerator keyGen = KeyGenerator.getInstance("AES");
			keyGen.init(128);
			Key key = keyGen.generateKey();
			System.out.println("Finish generating DES key");
			// 获得一个私鈅加密类Cipher，ECB是加密方式，PKCS5Padding是填充方法
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			System.out.println(" " + cipher.getProvider().getInfo());
			// 使用私鈅加密
			System.out.println(" Start encryption:");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] cipherText = cipher.doFinal(plainText);
			System.out.println("Finish encryption:");
			System.out.println(new String(cipherText, "UTF8"));
			System.out.println(" Start decryption:");
			cipher.init(Cipher.DECRYPT_MODE, key);
			byte[] newPlainText = cipher.doFinal(cipherText);
			System.out.println("Finish decryption:");
			System.out.println(new String(newPlainText, "UTF8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param content
	 */
	private static void publicCode(String content) {
		try {
			byte[] plainText = content.getBytes("UTF8");
			// 构成一个RSA密钥
			System.out.println(" Start generating RSA key");
			KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
			keyGen.initialize(1024);
			KeyPair key = keyGen.generateKeyPair();
			System.out.println("Finish generating RSA key");

			// 获得一个RSA的Cipher类，使用公鈅加密
			Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
			System.out.println(" " + cipher.getProvider().getInfo());
			System.out.println(" Start encryption");
			cipher.init(Cipher.ENCRYPT_MODE, key.getPublic());
			byte[] cipherText = cipher.doFinal(plainText);
			System.out.println("Finish encryption:");
			System.out.println(new String(cipherText, "UTF8"));

			// 使用私鈅解密
			System.out.println(" Start decryption");
			cipher.init(Cipher.DECRYPT_MODE, key.getPrivate());
			byte[] newPlainText = cipher.doFinal(cipherText);
			System.out.println("Finish decryption:");
			System.out.println(new String(newPlainText, "UTF8"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param content
	 * 
	 *            数字签名
	 */
	private static void DigitalSignature(String content) {
		try {
			byte[] plainText = content.getBytes("UTF8");
			// 形成RSA公钥对
			System.out.println(" Start generating RSA key");
			KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
			keyGen.initialize(1024);
			KeyPair key = keyGen.generateKeyPair();
			System.out.println("Finish generating RSA key");
			// 使用私鈅签名
			Signature sig = Signature.getInstance("SHA1WithRSA");
			sig.initSign(key.getPrivate());
			sig.update(plainText);
			byte[] signature = sig.sign();
			System.out.println(sig.getProvider().getInfo());
			System.out.println(" Signature:");
			System.out.println(new String(signature, "UTF8"));
			// 使用公鈅验证
			System.out.println(" Start signature verification");
			sig.initVerify(key.getPublic());
			sig.update(plainText);
			try {
				if (sig.verify(signature)) {
					System.out.println("Signature verified");
				} else
					System.out.println("Signature failed");
			} catch (SignatureException e) {
				System.out.println("Signature failed");
			}
		} catch (Exception er) {
			er.printStackTrace();
		}
	}
}
