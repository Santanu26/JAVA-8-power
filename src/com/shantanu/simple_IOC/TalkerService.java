package com.shantanu.simple_IOC;

public class TalkerService {
	private Italkable talkable = new EnglishTalker();
	public void sayHello() {
		talkable.talk();
	}

}
