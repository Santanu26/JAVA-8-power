package com.shantanu.dependencyinjection.injector;

import com.shantanu.dependencyinjection.consumer.Consumer;
import com.shantanu.dependencyinjection.consumer.MyDIApplication;
import com.shantanu.dependencyinjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		MyDIApplication app = new MyDIApplication();
		app.setService(new EmailServiceImpl());
		return app;
	}

}
