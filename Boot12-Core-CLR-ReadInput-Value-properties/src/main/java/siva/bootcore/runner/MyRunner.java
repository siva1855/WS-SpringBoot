package siva.bootcore.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class MyRunner implements CommandLineRunner {
	@Value("${employeeId}")
	private int eid;
	@Value("${employeeName}")
	private String ename;
	@Value("${employeeSalary}")
	private double esalary;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esalary);
	}

}
