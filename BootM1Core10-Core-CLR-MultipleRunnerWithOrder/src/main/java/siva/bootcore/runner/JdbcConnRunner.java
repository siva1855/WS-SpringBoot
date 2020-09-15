package siva.bootcore.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(1)
public class JdbcConnRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("JdbcConnRunner---used...@Order(annotation)");

	}

}
