package siva.bootcore.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import siva.bootcore.service.ProcessService;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	private ProcessService processService;

	
	@Value("${app.name}")
	private String proceeName;
	@Value("${app.location}")
	private String processLocation;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("------From MyRunner------");
		processService.processFind();
		System.out.println(proceeName+"-----"+processLocation);
		
	}

}
