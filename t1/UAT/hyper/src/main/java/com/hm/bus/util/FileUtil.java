package com.hm.bus.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.gep.core.util.OssOpsUtils;
import com.gep.util.PropertyUtils;

/**
 * @ClassName: FileUtil
 * @Description: 文件上传下载工具类
 * @author qiuyuan
 * @date 2016年1月28日 下午7:53:25
 */
public class FileUtil {

	/**
	 * @Method: getOssId
	 * @Description: 上传文件到云，获取OSSID
	 * @param request
	 * @return
	 */
	public static String getOssId(HttpServletRequest request) {
		String tempPath = null;
		String contentType = null;
		String key = null;
		try {
			tempPath = uploadFile(request);
			contentType = getContentType(tempPath);
			key = OssOpsUtils.uploadFile(tempPath, contentType);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return key;
	}

	public static InputStream getOssFile(String filename,String key, HttpServletResponse response) {
		InputStream in = null;
//		BufferedOutputStream out = null;
		try {
			
			String bucketName =  PropertyUtils.getConfig("oss.bucketname");
			in = OssOps.getObject(bucketName, key);
			if (in == null) {
				System.out.println("[FileUtil] getOssFile method InputStream为NULL!");
				return null;
			}

//			out = new BufferedOutputStream(response.getOutputStream());
//			response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(filename, "utf-8"));
//			byte[] car = new byte[1024];
//			int L = 0;
//			while ((L = in.read(car)) != -1) {
//				out.write(car, 0, L);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			try {
//				if (in != null) {
//					in.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			try {
//				if (out != null) {
//					out.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
		return in;
	}

	/**
	 * 将文件上传到服务器本地
	 * 
	 * @param request
	 * @throws Exception
	 */
	private static String uploadFile(HttpServletRequest request) throws Exception {
		// 创建一个通用的多部分解析器
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
		// 判断 request 是否有文件上传,即多部分请求
		String tempPath = null;
		if (multipartResolver.isMultipart(request)) {
			// 转换成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 取得request中的所有文件名
			Iterator<String> iter = multiRequest.getFileNames();
			while (iter.hasNext()) {
				// 取得上传文件
				MultipartFile file = multiRequest.getFile(iter.next());
				if (file != null) {
					// 取得当前上传文件的文件名称
					String myFileName = file.getOriginalFilename();
					// 如果名称不为“”,说明该文件存在，否则说明该文件不存在
					if (myFileName.trim() != "") {
						System.out.println(myFileName);
						// 重命名上传后的文件名
						String fileName = file.getOriginalFilename();
						// 定义上传路径
						String path = getPath(request) + fileName;
						tempPath = path;
						try {
							ensureFileExist(new File(path));
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						File localFile = new File(path);
						file.transferTo(localFile);
					}
				}
			}

		}
		return tempPath;
	}

	private static boolean ensureFileExist(File f) throws IOException {
		if (f.exists())
			return true;
		File parent = f.getParentFile();
		if (!parent.exists()) {
			parent.mkdirs();
		}
		return f.createNewFile();
	}

	private static String getContentType(String path) {
		int index = path.lastIndexOf(".");
		return path.substring(index + 1);
	}

	private static String getPath(HttpServletRequest request) {
		String path = request.getSession().getServletContext().getRealPath("/") + "tempFile/";
		return path;
	}

}
