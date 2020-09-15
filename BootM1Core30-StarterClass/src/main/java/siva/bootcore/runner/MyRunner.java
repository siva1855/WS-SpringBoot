package siva.bootcore.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("from MyRunner class run().....");
	}

	public static void main(String[] args) {
		System.out.println("from MyRunner class main()..... ");
	}
}
