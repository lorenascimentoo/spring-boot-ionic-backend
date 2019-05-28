package com.cursomvc.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.cursomvc.domain.Pedido;

public interface EmailService {

	void sendOrderConfimationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);

	void sendOrderConfimationHtmlEmail(Pedido obj);

	void sendHtmlEmail(MimeMessage msg);

}
