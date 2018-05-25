package com.shantanu.simple_IOC;

import java.util.Hashtable;
import java.util.Map;

public class TalkableMain {
	public static void main(String[] args) {
		Hashtable<Character,Integer> table = new Hashtable<Character,Integer>();
		String str = "aasjjikkk";
		for(char c: str.toCharArray() ) {
		    if( table.get(c) == null )
		        table.put(c,1);
		    else
		        table.put(c,table.get(c) + 1);
		}

		System.out.println(table);
		
		
		
		
	}

}
