package siva.bootcore.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public CommandLineRunner clr() {
		return (args) -> {
			System.out.println("......By Using Lambda Expression.......");
		};
	}
}
