package siva.bootcore.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	private Environment environment;

	@Override
	public void run(String... args) throws Exception {
		int eid = environment.getProperty("employeeId", Integer.class);
		String ename = environment.getProperty("employeeName");
		double esalary = environment.getProperty("employeeSalary", Double.class);

		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esalary);
	}

}
