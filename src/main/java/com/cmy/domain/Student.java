package com.cmy.domain;

public class Student {

	public int age=0;
	public String name;

	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	public void pstudent() {
		System.out.println("yyyyy" + name);

	}

	
}
