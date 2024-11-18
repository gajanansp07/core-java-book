package com.core.book.javacollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExampleStringList {
	
	 // Custom Comparator to sort strings by their length
		static class MyComparator implements Comparator<String> {

			@Override
			public int compare(String o1, String o2) {
				if (o1 != null && o2 != null)
					return o1.length() - o2.length();
				return 0;
			}

		}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Rajesh");
		list.add("Mahesh");
		list.add("Raju");
		list.add("Gajanan");
		
		System.out.println("List size : "+list.size());
		System.out.println("Original List: " + list);
		System.out.println(list);
		// Sorting using natural order (alphabetical)
		list.sort(null);
		System.out.println("Sorting using natural order : "+ list);
		// Sorting using custom comparator (by length)
        list.sort(new MyComparator());
        System.out.println("Sorted by Length: " + list);
        // Sorting using lablda expression 
        
        list.sort((a,b)->b.length()-a.length());
        
        System.out.println("Sorted by Length deseding order: " + list);
        
        
	}

}