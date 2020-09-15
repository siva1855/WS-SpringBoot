package siva.bootcore.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

	@Value("${id}")
	private int pid;
	@Value("${name}")
	private String pname;
	@Value("${age}")
	private int page;
	@Value("${color}")
	private String pcolor;
	@Value("${height}")
	private int pheight;
	@Value("${weight}")
	private int pweight;

	@Override
	public String toString() {
		return "MyRunner [pid=" + pid + ", pname=" + pname + ", page=" + page + ", pcolor=" + pcolor + ", pheight="
				+ pheight + ", pweight=" + pweight + "]";
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
	}

}
