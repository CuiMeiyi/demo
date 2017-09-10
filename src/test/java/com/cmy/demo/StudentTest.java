package com.cmy.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmy.domain.Student;

public class StudentTest /*extends BaseTest*/{
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("cuimeiyi");
		student.pstudent();
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		Student studentnew = (Student) ctx.getBean("student");
		studentnew.pstudent();
	}

}
