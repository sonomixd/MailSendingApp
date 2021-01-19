package com.sonomixd.MailSendingApp.repositories;

import com.sonomixd.MailSendingApp.entities.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateRepository extends JpaRepository<Template, Long> {
    Template findByTemplateKey(String key);
}
