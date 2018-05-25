package com.shantanu.dependencyinjection.test;

import com.shantanu.dependencyinjection.consumer.Consumer;
import com.shantanu.dependencyinjection.consumer.MyDIApplication;
import com.shantanu.dependencyinjection.injector.MessageServiceInjector;

import org.junit.*;

import com.shantanu.dependencyinjection.service.MessageService;

public class MyDIApplicationJUnitTest {

	private MessageServiceInjector injector;

	@Before
	public void setUp() {
		// mock the injector with anonymous class
		injector = new MessageServiceInjector() {

			@Override
			public Consumer getConsumer() {
				// mock the message service
				return new MyDIApplication(new MessageService() {

					@Override
					public void sendMessage(String msg, String rec) {
						System.out.println("Mock Message Service implementation");

					}
				});
			}
		};
	}

	@Test
	public void test() {
		Consumer consumer = injector.getConsumer();
		consumer.processMessages("Hi Pankaj", "pankaj@abc.com");
	}

	@After
	public void tear() {
		injector = null;
	}

}
