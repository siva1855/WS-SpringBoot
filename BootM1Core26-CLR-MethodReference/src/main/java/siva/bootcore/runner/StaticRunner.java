package siva.bootcore.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import siva.bootcore.service.StaticService;

@Component
public class StaticRunner {

	@Bean
	public CommandLineRunner commandLineRunner1() {
		CommandLineRunner clr1 = StaticService::staticMethod;
		return clr1;
	}

}
