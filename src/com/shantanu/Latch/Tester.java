package com.shantanu.Latch;

import java.util.concurrent.CountDownLatch;

public class Tester implements Runnable{
	private CountDownLatch latch;
	private String name;
	public Tester(CountDownLatch latch, String name) {
		this.latch = latch;
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(
				String.format("Tester %s is waiting for the developers"
						+ "to finish their work! \n",name));
		try {
			latch.await();
		} catch(InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new AssertionError(e);
		}
		System.out.println(
				String.format("Testing done by tester: %s  " , name));
		this.latch.countDown();
	}
	

}
