package siva.bootemail.service;

import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.AbstractResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class MailService {
	@Autowired
	private JavaMailSender javaMailSender;

	public boolean send(String to, String subject, String text, AbstractResource file) {
		boolean isSent = false;
		try {
			MimeMessage mimeMessage = javaMailSender.createMimeMessage();
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, file != null);
			mimeMessageHelper.setTo(to);
			mimeMessageHelper.setSubject(subject);
			if (text != null)
				mimeMessageHelper.setText(text);

			if (file != null)
				mimeMessageHelper.addAttachment(file.getFilename(), file);

			javaMailSender.send(mimeMessage);
			isSent = true;

		} catch (Exception e) {
			isSent = false;
			e.printStackTrace();
		}
		return isSent;
	}

}
