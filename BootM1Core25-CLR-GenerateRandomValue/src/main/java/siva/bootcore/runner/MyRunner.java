package siva.bootcore.runner;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.app")
public class MyRunner implements CommandLineRunner {

	private int id;
	private String name;
	private long mobileNumber;
	private UUID hexNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public UUID getHexNumber() {
		return hexNumber;
	}

	public void setHexNumber(UUID hexNumber) {
		this.hexNumber = hexNumber;
	}

	@Override
	public String toString() {
		return "MyRunner [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", hexNumber=" + hexNumber
				+ "]";
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}
}
