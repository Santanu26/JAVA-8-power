package com.shantanu.executorFrameWork;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
	private int count;
	private Lock lock = new ReentrantLock();
	
	public void increment() {
		lock.lock();
		count++;
		lock.unlock();
	}

}
