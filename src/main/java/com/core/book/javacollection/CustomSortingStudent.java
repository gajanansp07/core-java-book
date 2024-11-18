package com.core.book.javacollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.core.book.vo.Student;

public class CustomSortingStudent {

	static class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {

			return o1.age - o2.age;
		}

	}

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Mahesh", 36, 3.8));
		list.add(new Student("Gajanan", 36, 3.2));
		list.add(new Student("Devansh", 1, 3.1));
		list.add(new Student("Vaishnavi", 23, 3.5));
		list.add(new Student("Alish", 1, 3.8));
		list.add(new Student("Adavit", 12, 5.2));

		// Sort By age
		System.out.println("Sort By age : ");
		list.sort(new StudentComparator());
		for (Student s : list)
			System.out.println(s);

		list.sort((s1, s2) -> {
			if (s1.gpa - s2.gpa > 0) {
				return 1;
			} else if (s1.gpa - s2.gpa < 0) {
				return -1;
			} else {
				return 0;
			}
		});
		System.out.println("Sort by GPA : ");
		// sort by gpa
		for (Student s : list)
			System.out.println(s);
		
		
		System.out.println("Using comparing method compare by name:");
		Comparator<Student> comparator = Comparator.comparing(Student::getAge).reversed().thenComparing(Student::getName);
		list.sort(comparator);
		for (Student s : list)
			System.out.println(s);
		
		
	}

}
