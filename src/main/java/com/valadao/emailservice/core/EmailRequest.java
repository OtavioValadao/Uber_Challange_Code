package com.valadao.emailservice.core;

import java.util.List;

public record EmailRequest(List<String> emailsToReceive, String subject, String body) {
}
