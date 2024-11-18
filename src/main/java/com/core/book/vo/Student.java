package com.core.book.vo;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	public String name;
	public int age;
	public Double gpa;
	
	public Student() {
		
	}
	public Student(String name, int age, Double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gpa=" + gpa + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getGpa() {
		return gpa;
	}
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	
	

}
