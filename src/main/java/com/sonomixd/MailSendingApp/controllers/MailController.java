package com.sonomixd.MailSendingApp.controllers;

import com.sonomixd.MailSendingApp.beans.MailSendRequest;
import com.sonomixd.MailSendingApp.services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MailController {

	@Autowired
	private MailService notificationService;

	@PostMapping(path = "/mail/send", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void sendMail(@RequestBody MailSendRequest request) {

		notificationService.generateAndSendMail(request);
	}
}