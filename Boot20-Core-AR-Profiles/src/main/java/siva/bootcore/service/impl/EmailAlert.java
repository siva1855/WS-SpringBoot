package siva.bootcore.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import siva.bootcore.service.AlertService;
@Component
@Profile("default")
public class EmailAlert implements AlertService{

	@Override
	public void sendAlert() {
		System.out.println("from EmailAlert");
		
	}

}
