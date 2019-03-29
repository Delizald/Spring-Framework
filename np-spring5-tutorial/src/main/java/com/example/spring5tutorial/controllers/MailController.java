package com.example.spring5tutorial.controllers;

import javax.mail.MessagingException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring5tutorial.mail.MailSender;

@RestController
public class MailController {
	
	private MailSender mailSender;

	public MailController(MailSender smtp) {
		this.mailSender = smtp;
	}

	@RequestMapping("/mail")
	public String mail() throws MessagingException {
		
		mailSender.send("asdasdas@text.com", "A test", "Body");
		
		return "Mail sent";
	}
}
