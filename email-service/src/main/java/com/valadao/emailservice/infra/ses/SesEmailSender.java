package com.valadao.emailservice.infra.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.valadao.emailservice.adapters.EmailSenderGateway;
import com.valadao.emailservice.core.exeptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SesEmailSender implements EmailSenderGateway {


    private final AmazonSimpleEmailService amazonSimpleEmailService;

    @Autowired
    public SesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService) {
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }

    @Override
    public void sendEmail(List<String> emailsToReceive, String subject, String body) {
        SendEmailRequest request = new SendEmailRequest()//Request para enviar para a AWS
                .withSource("aprendizagem.moderna@gmail.com")//Origem de quem está enviando
                .withDestination(new Destination().withToAddresses(emailsToReceive))//Destino da menssagem
                .withMessage(new Message() // menssagem a ser enviada
                        .withSubject(new Content(subject))
                        .withBody(new Body().withText(new Content(body))));
        try{
            this.amazonSimpleEmailService.sendEmail(request);
        }catch (AmazonServiceException ex){
            System.out.println(ex);
            throw new EmailServiceException("Falha ao enviar o email", ex);
        }

    }
}
