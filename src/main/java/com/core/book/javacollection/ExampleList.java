package com.core.book.javacollection;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Rajesh");
		list.add("Mahesh");
		list.add("Rajesh");
		list.add("Gajanan");
		
		for(String name : list) {
			System.out.println(name);
		}
	}

}
