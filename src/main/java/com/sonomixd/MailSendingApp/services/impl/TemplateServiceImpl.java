package com.sonomixd.MailSendingApp.services.impl;

import com.sonomixd.MailSendingApp.entities.Template;
import com.sonomixd.MailSendingApp.repositories.TemplateRepository;
import com.sonomixd.MailSendingApp.services.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemplateServiceImpl implements TemplateService {

    @Autowired
    private TemplateRepository templateRepository;

    @Override
    public byte[] getBlobByKey(String templateKey) {

        Template template = templateRepository.findByTemplateKey(templateKey);

        byte[] templateByte = null;
        if (template != null) {
            templateByte =  template.getData();
        }

        return templateByte;
    }
}
