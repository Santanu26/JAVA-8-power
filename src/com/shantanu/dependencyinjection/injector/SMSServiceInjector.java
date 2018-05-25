package com.shantanu.dependencyinjection.injector;

import com.shantanu.dependencyinjection.consumer.Consumer;
import com.shantanu.dependencyinjection.consumer.MyDIApplication;
import com.shantanu.dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}
