package siva.bootcore.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import siva.bootcore.service.InstanceService;

@Component
public class InstanceRunner {

	@Bean
	public CommandLineRunner commandLineRunner2() {
		CommandLineRunner clr2 = new InstanceService()::instanceMethod;
		return clr2;
	}
}
