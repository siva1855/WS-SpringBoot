package siva.bootcore.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import siva.bootcore.model.Student;

@SpringBootApplication
public class AppConfig {

	public static void main(String[] args) {
		System.out.println("from AppConfig class main().......");

	}

	@Bean
	public Student student() {
		System.out.println("from AppConfig class @Bean student()......");
		return new Student();
	}

}
