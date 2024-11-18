package com.core.book.javacollection;

import java.util.Comparator;

class MyComparator2 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1!=null && o2!=null)
			return o1.length()-o2.length();
		return 0;
	}
		
	}