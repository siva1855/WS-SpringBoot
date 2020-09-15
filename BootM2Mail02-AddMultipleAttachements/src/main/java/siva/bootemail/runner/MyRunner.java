package siva.bootemail.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;
import siva.bootemail.service.MailService;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	private MailService mailService;

	@Override
	public void run(String... args) throws Exception {

		FileSystemResource attachment1 = new FileSystemResource("D:\\JavaWorkspaces\\WS-SpringBoot\\images\\GamesGosling.jpg");
		FileSystemResource attachment2 = new FileSystemResource("D:\\JavaWorkspaces\\WS-SpringBoot\\images\\APJ Abdul Kalam.jpg");
		FileSystemResource attachment3 = new FileSystemResource("D:\\JavaWorkspaces\\WS-SpringBoot\\images\\Sivakumar (2yearsExperenced).pdf");

		FileSystemResource[] fileSystemResource = new FileSystemResource[] { attachment1, attachment2, attachment3 };

		boolean sent = mailService.send("siva.muluguri@gmail.com", "Welcome To Java World",
				                              "To Build Web Applications By Using Java Techonology",
				                                fileSystemResource);

		if (sent)
			System.out.println("Mail sent Success!!!");
		else
			System.out.println("Please Check Code Mail not sent.....");
	}

}
