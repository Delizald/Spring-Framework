package com.example.spring5tutorial.mail;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;

//@Component
//@Qualifier("smtpMail")
public class SmtpMailSender implements MailSender{ 
	private static Log log = LogFactory.getLog(SmtpMailSender.class);
	
	private JavaMailSender javaMailSender;
	
	public SmtpMailSender(JavaMailSender javaMailSender) {
		super();
		this.javaMailSender = javaMailSender;
	}
	@Override
	public void send(String to, String subject, String body) throws MessagingException {
	  MimeMessage message = javaMailSender.createMimeMessage();
	  MimeMessageHelper helper;
	  
	  helper = new MimeMessageHelper(message, true);
	  helper.setSubject(subject);
	  helper.setTo(to);
	  helper.setText(body,true);
	  
	  javaMailSender.send(message);
	}
}
