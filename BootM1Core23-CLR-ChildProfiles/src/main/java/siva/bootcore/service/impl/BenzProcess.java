package siva.bootcore.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import siva.bootcore.service.ProcessService;

@Component
@Profile("benz")
public class BenzProcess implements ProcessService {

	@Override
	public void processFind() {
		// TODO Auto-generated method stub
		System.out.println("from BenzProcess");
	}

}
