package com.shantanu.Latch;

import java.util.concurrent.CountDownLatch;

public class WorkAppMain {
	public static void main(String[] args) throws InterruptedException{
		CountDownLatch latch = new CountDownLatch(4);
		
		Worker first = new Worker(1000, latch , "First Worker");
		Worker second = new Worker(2000, latch, "Second Worker");
		Worker third = new Worker(3000, latch, "Third Worker");
		Worker fourth = new Worker(4000, latch, "Fourth Worker");
		
		first.start();
		second.start();
		third.start();
		fourth.start();
		
		latch.await();
		
		System.out.println(Thread.currentThread().getName() +"Finished");
		
	}

}
