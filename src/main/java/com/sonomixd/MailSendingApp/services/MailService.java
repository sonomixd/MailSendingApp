package com.sonomixd.MailSendingApp.services;

import com.sonomixd.MailSendingApp.beans.MailSendRequest;

public interface MailService {

    void generateAndSendMail(MailSendRequest request);
}
