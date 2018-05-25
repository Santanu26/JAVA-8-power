package com.shantanu.Latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Manager {
	public static void main(String[] args) {
		ExecutorService executorService = 
				Executors.newFixedThreadPool(3);
		CountDownLatch latch = new CountDownLatch(2);
		Developer dev1 = new Developer(latch , "Developer #1");
		Developer dev2 = new Developer(latch , "Developer #2");
		
		Tester tester = new Tester(latch , "Tester #1");
		
		executorService.execute(dev1);
		executorService.execute(dev2);
		executorService.execute(tester);
		executorService.shutdown();
		
	}

}
