package com.hm.bus.util;

import java.util.List;

public class SentBusRunnable implements Runnable {

	List<String> lists = null;

	public SentBusRunnable(List<String> lists) {
		this.lists = lists;
	}

	@Override
	public void run() {

	}

	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}

}
