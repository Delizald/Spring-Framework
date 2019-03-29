package com.example.spring5tutorial.mail;

import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.apache.commons.logging.Log;

//@Primary
//@Component
public class MockMailSender implements MailSender{ 
	private static Log log = LogFactory.getLog(MockMailSender.class);
	
	@Override
	public void send(String to, String subject, String body) {
		log.info("Sending Mock mail to " + to);
		log.info("With subject " + subject);
		log.info("With body " + body);
	}
}
