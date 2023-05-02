package com.dal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dal.Welcome;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Welcome.xml");
	
		Welcome wel = (Welcome)context.getBean("welc");
		System.out.println(wel.sayHi());
	}

}
