package com.shantanu.Latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Developer implements Runnable{
	private CountDownLatch latch;
	private String name;
	public Developer(CountDownLatch latch, String name) {
		this.latch = latch;
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(
				String.format("Task assigned to developer : %s",name));
		try {
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Developers are working !!!");
		} catch(InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new AssertionError(e);
		}
		System.out.println(
				String.format("Task finished by developer: %s " , name));
		this.latch.countDown();
	}
	

}
