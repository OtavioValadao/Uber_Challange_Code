package com.valadao.emailservice.adapters;

import java.util.List;

public interface EmailSenderGateway {
    void sendEmail(List<String> emailsToReceive, String subject, String body);
}
