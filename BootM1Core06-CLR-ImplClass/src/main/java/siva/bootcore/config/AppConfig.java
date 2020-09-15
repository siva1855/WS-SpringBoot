package siva.bootcore.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import siva.bootcore.runner.MyRunner;

@Configuration
public class AppConfig {
	@Bean
	public CommandLineRunner commandLineRunner() {
		return new MyRunner();

	}

}
