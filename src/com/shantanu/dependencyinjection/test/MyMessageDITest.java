package com.shantanu.dependencyinjection.test;

import com.shantanu.dependencyinjection.consumer.Consumer;
import com.shantanu.dependencyinjection.injector.EmailServiceInjector;
import com.shantanu.dependencyinjection.injector.MessageServiceInjector;
import com.shantanu.dependencyinjection.injector.SMSServiceInjector;

public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Hello Shantanu";
		String email = "cushantanu@gmail.com";
		String phone = "123456789";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}

}
