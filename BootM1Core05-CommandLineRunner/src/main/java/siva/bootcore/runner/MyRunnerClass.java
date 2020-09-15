package siva.bootcore.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunnerClass implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("....these is CommandLineRunner it will execute only one time.....");

	}

}
