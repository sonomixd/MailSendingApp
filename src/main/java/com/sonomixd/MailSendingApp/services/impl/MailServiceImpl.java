package com.sonomixd.MailSendingApp.services.impl;

import com.sonomixd.MailSendingApp.beans.MailSendRequest;
import com.sonomixd.MailSendingApp.services.MailService;
import com.sonomixd.MailSendingApp.services.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private TemplateService templateService;

    @Override
    public void generateAndSendMail(MailSendRequest request) {

        String templateKey = request.getTemplateKey();

        templateService.getBlobByKey(templateKey);
    }
}