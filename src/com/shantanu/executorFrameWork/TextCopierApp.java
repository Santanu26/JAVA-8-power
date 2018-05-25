package com.shantanu.executorFrameWork;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

public class TextCopierApp {
	public static void main(String[] args) {
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		System.out.println(availableProcessors);
		TextCopier test = new TextCopier("https://www.youtube.com/");
		TextCopier masterDev = new TextCopier("https://facebook.com/");
		List<TextCopier> tasks = Arrays.asList(test , masterDev);
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		try {
			List<Future<String>> futures = executorService.invokeAll(tasks);
			for(Future<String> future : futures) {
				String result = future.get();
				System.out.println(result);
			}
		} catch(InterruptedException | ExecutionException e) {
			Thread.currentThread().interrupt();
			new AssertionError(e);
		}
	}

}
