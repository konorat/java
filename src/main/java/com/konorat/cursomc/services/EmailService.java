package com.konorat.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.konorat.cursomc.domain.Pedido;

import jakarta.mail.internet.MimeMessage;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendOrderConfirmationHtmlEmail(Pedido obj);
	
	void sendHtmlEmail(MimeMessage msg);
}
