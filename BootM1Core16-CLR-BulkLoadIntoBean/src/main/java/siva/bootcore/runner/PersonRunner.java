package siva.bootcore.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import siva.bootcore.bean.Person;

@Component
@ConfigurationProperties("my")
public class PersonRunner implements CommandLineRunner {
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "PersonRunner [person=" + person + "]";
	}

	@Override
	public void run(String... args) throws Exception {
		//it is calling toString method
		System.out.println(this);
	}

}
