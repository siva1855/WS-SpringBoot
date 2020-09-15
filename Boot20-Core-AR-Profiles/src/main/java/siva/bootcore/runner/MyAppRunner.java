package siva.bootcore.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import siva.bootcore.service.AlertService;

@Component
public class MyAppRunner implements ApplicationRunner {
	@Autowired
	private AlertService alertService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		alertService.sendAlert();
	}

}
