package siva.bootcore.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import siva.bootcore.model.Employee;

@Component
public class MyRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		Employee employee1 = new Employee();

		employee1.setEmployeeId(101);
		employee1.setEmployeeName("Sivakuamr");
		employee1.setEmployeeSalary(30000.50);

		System.out.println(employee1.toString());
		System.out.println(employee1.getClass().getName());
		System.out.println(employee1.hashCode());
		System.out.println(employee1.equals(employee1));
		System.out.println(employee1 == employee1);
		System.out.println("................");
		Employee employee2 = new Employee(101, "Sivakumar", 30000.50);

		System.out.println(employee2.toString());
		System.out.println(employee2.hashCode());
		System.out.println(employee2.equals(employee2));
		System.out.println(employee1.equals(employee2));
		System.out.println(employee1 == employee2);

	}

}
