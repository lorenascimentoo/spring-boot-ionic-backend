package com.cursomvc.services;

import org.springframework.mail.SimpleMailMessage;

import com.cursomvc.domain.Pedido;

public interface EmailService{

	void sendOrderConfimationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}