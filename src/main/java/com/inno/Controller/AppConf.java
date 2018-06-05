package com.inno.Controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inno.model.CustomerService;
import com.inno.model.HelloIndia;
import com.inno.model.HelloWorld;

public class AppConf {
	 public static void main( String[] args )
	    {
	    	ConfigurableApplicationContext context =
			new ClassPathXmlApplicationContext(new String[] {"spring-Customer.xml"});
	    	

	    	CustomerService cust = (CustomerService)context.getBean("customerService");
	    	 HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
	         objA.getMessage1();
	         objA.getMessage2();

	         HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
	         objB.getMessage1();
	         objB.getMessage2();
	         objB.getMessage3();
	    	System.out.println(cust);

	    	context.close();
	    }


}
