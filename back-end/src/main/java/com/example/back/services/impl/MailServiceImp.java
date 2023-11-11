package com.example.back.services.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
@Validated
public class MailServiceImp {

    @Value("${sendMail.Boolean.Value}")
    private boolean sendMail;
    private final JavaMailSender mailSender;
    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    public MailServiceImp(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }



    public void enrolledInEventMail(String to, String subject, String title, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("Te has inscripto al evento: " + title);
        message.setText(text);
        mailSender.send(message);
    }

    public void enrolledInCourseMail(String to, String subject, String title, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("Te has inscripto al curso: " + title);
        message.setText(text);
        mailSender.send(message);
    }
}
