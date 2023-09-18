package com.valadao.emailservice.core;

import java.util.List;

public interface EmailServiceUserCase {

    void sendEmail(List<String> emailsToReceive, String subject, String body);
}
