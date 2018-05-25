package com.shantanu.Latch;

import java.util.concurrent.CountDownLatch;

public class Worker extends Thread{
	private String name;
	private int delay;
	private CountDownLatch latch;
	public Worker(int delay, CountDownLatch latch,String name) {
		super(name);
		this.delay = delay;
		this.latch = latch;
		this.name = name;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(delay);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		latch.countDown();
		System.out.println(Thread.currentThread().getName() + "Finished");
	}

}
