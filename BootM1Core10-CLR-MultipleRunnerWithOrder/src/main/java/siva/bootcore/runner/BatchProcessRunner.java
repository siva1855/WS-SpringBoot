package siva.bootcore.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class BatchProcessRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("BatchProcessRunner");
	}

}
