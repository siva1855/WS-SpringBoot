package siva.bootcore.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
	@Value("${id}")
	private int personId;
	@Value("${person.name}")
	private String personName;
	@Value("${age}")
	private int personAge;

	@Override
	public String toString() {
		return "MyRunner [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + "]";
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

}
