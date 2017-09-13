package com.hm.bus.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;

import com.aliyun.oss.ClientConfiguration;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.OSSObject;
import com.gep.util.PropertyUtils;

public class OssOps {

	private static String bucketName = "";

	private static OSSClient ossClient;
	private static String topDir;

	private static final Logger log = Logger.getLogger(OssOps.class);
	static {
		String accessId = "";
		String accesskey = "";
		String ossendpoint = "";
		try {
			accessId = PropertyUtils.getConfig("oss.accessid");
			accesskey = PropertyUtils.getConfig("oss.accesskey");
			ossendpoint = PropertyUtils.getConfig("oss.ossendpoint");
			bucketName = PropertyUtils.getConfig("oss.bucketname");
			topDir = PropertyUtils.getConfig("oss.chaonengTopDir");

		} catch (Exception e) {
			log.error("oss 相关参数没有设置，请到config.properties 文件中设置相关参数", e);
		}
		try {
			ClientConfiguration config = new ClientConfiguration();
			config.setConnectionTimeout(20 * 1000);

			ossClient = new OSSClient(ossendpoint, accessId, accesskey, config);
		} catch (Exception e) {
			log.error("oss 相关参数配置有误，请到config.properties 文件中设置相关参数", e);
		}
	}

	/**
	 * 2017/1/16 获取阿里云文件流对象
	 * 
	 * @param filename
	 * @param key
	 * @return
	 */
	public static InputStream getObject(String filename, String key) {
		InputStream in = null;
		try {

			OSSObject ossObject = ossClient.getObject(filename, key);
			in = new BufferedInputStream(ossObject.getObjectContent());
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
//			try {
//				if (in != null) {
//					in.close();
//				}
//			} catch (IOException e) {
//				log.error(e.getMessage(), e);
//			}
		}
		return in;
	}

	public static void main(String[] args) {
	}

}
