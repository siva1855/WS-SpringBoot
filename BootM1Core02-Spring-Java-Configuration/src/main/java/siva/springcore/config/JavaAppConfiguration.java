package siva.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import siva.springcore.beans.Employee;

@Component
public class JavaAppConfiguration {

	@Bean
	public Employee employee() {
		Employee emp = new Employee();
		emp.setEmployeeId(101);
		emp.setEmployeeName("Sivakumar");
		emp.setEmployeeSalary(30000);
		return emp;
	}
}
