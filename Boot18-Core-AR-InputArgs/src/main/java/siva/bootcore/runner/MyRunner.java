package siva.bootcore.runner;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("getNonOptionArgs..." + args.getNonOptionArgs());
		System.out.println("getOptionNames..." + args.getOptionNames());
		System.out.println("containsOption....." + args.containsOption("title"));
		System.out.println("getOptionValues...." + args.getOptionValues("product"));
		System.out.println("getSourceArgs..." + Arrays.asList(args.getSourceArgs()));

	}

}
