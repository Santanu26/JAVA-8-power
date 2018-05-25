package com.shantanu.executorFrameWork;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class TextCopier implements Callable<String>{
private String target;

	public TextCopier(String target) {
	this.target = target;
}

	@Override
	public String call() throws Exception {
		URL url = new URL(target);
		StringBuilder builder = new StringBuilder();
		try (InputStream iStream = url.openConnection().getInputStream()) {
			Scanner scanner = new Scanner(iStream);
			while (scanner.hasNext()) {
				builder.append(scanner.nextLine());
			}
			return builder.toString();
		}
	}
	

}
