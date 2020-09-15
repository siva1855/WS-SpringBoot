package siva.bootcore.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceRunner implements CommandLineRunner, Ordered {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("EmailServiceRunner---used..Ordered(interface)");

	}

	@Override
	public int getOrder() {
		return (2);
	}

}
