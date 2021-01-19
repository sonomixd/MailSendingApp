package com.sonomixd.MailSendingApp.repositories;

import com.sonomixd.MailSendingApp.entities.Template;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateRepository extends JpaRepository<Template, Long> {
    Template findByTemplateKey(String key);
}
