package com.cmy.demo;

import com.cmy.domain.Student;

public class Test123 {

	private static String name="cuimeiyi";
	public static void main(String[] args) {
		final int NUM = -10;
		//char NUM;
		//NUM = 100;
		System.out.println(NUM + "!!!");
		Student student = new Student();
		Student student1 = new Student();
		student.age+=2;
		//student1.age+=2;
		
		System.out.println(name);
		System.out.println(student.toString());
		System.out.println(student1.toString());

	}
}
