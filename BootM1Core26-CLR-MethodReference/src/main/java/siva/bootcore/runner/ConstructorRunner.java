package siva.bootcore.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import siva.bootcore.service.ConstructorService;

@Component
public class ConstructorRunner {
	@Bean
	public CommandLineRunner commandLineRunner3() {
		CommandLineRunner clr3 = ConstructorService::new;
		return clr3;
	}

}
