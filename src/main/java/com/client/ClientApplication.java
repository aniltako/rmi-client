package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {
	
	
	public static void main(String arg[]){
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");  
		Calculation calculation = (Calculation)context.getBean("calculationBean");  
		System.out.println(calculation.greeding("Anil Tako"));  
	}

}
