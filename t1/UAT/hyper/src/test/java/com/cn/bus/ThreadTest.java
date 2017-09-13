package com.cn.bus;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.hm.bus.module.BusLnApp;
import com.hm.bus.util.BusSentRunnable;

/**
 * 多线程测试
 * 
 * @author leimeng E-mail: leimeng@9fchaoneng.com
 * @version 创建时间：2017年1月20日 上午9:59:48
 */
public class ThreadTest {

	public static void main(String[] args) {
		BlockingQueue queue = new LinkedBlockingQueue();
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 10, TimeUnit.SECONDS, queue);
		executor.allowCoreThreadTimeOut(true);

		Long appId = null;
		String LNAPP_QUERY_URL = "";
		Map<String, Object> paramMap = null;
		String RSQPRIVATEKEY = "";
		BusLnApp lnApp = null;
		String userId = "";
		String oldstatus = "";

		for (Long i = 1L; i <= 10; i++) {
			executor.execute(new BusSentRunnable(i, LNAPP_QUERY_URL, paramMap, RSQPRIVATEKEY, lnApp, oldstatus, null) {
				public void run() {
					try {
						Random rand = new Random();
						// 休眠半秒到一秒
						Thread.sleep(rand.nextInt(500) + 500);
						System.out.println("第" + this.getAppId() + "个");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}
