package com.hm.bus.util;


public class Sent2RedisRunnable implements Runnable {

	String batchNO = "";


	public Sent2RedisRunnable(String batchNO) {
		super();
		this.batchNO = batchNO;
	}

	@Override
	public void run() {

	}

	public String getBatchNO() {
		return batchNO;
	}

	public void setBatchNO(String batchNO) {
		this.batchNO = batchNO;
	}

	

}
