package com.valadao.emailservice.controller;

import com.valadao.emailservice.application.EmailSenderService;
import com.valadao.emailservice.core.EmailRequest;
import com.valadao.emailservice.core.exeptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {

    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailSenderController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @PostMapping
    private ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest) {
        try {
            this.emailSenderService.sendEmail(emailRequest.emailsToReceive(), emailRequest.subject(), emailRequest.body());
            return ResponseEntity.ok("Email enviado com sucesso!");
        } catch (EmailServiceException exception) {
            return ResponseEntity.badRequest().body("Erro ao enviar o emai.");
        }
    }
}
