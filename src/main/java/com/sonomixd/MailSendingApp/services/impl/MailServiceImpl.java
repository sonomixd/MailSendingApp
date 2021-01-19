package com.sonomixd.MailSendingApp.services.impl;

import com.sonomixd.MailSendingApp.beans.MailSendRequest;
import com.sonomixd.MailSendingApp.services.MailService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

    @Override
    public void generateAndSendMail(MailSendRequest request) throws ServiceException {

    }
}