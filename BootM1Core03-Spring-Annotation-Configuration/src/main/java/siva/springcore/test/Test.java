package siva.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.springcore.beans.Employee;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Employee.class);
		Object obj = applicationContext.getBean("employee",Employee.class);
		Employee employee = (Employee) obj;
		System.out.println(employee);
	}

}
