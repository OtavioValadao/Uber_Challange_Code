package com.valadao.emailservice.application;

import com.valadao.emailservice.adapters.EmailSenderGateway;
import com.valadao.emailservice.core.EmailServiceUserCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailSenderService implements EmailServiceUserCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(List<String> emailsToReceive, String subject, String body) {
        this.emailSenderGateway.sendEmail(emailsToReceive, subject, body);
    }
}
