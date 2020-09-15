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
		FileSystemResource fileSystemResource = new FileSystemResource("D:\\JavaWorkspaces\\WS-SpringBoot\\images\\GamesGosling.jpg");
		
		boolean sent = mailService.send("siva.muluguri@@gmail.com", "Welcome To Java World",
				                         "The SpringFramework is a lightweight solution and a potential one-stop-shop for building your enterprise-ready applications",
				                          fileSystemResource);
		
		if (sent)
			System.out.println("Mail sent Success!!!");
		else
			System.out.println("Please Check Code Mail not sent.....");
	}

}
