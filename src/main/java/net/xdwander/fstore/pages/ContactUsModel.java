package net.xdwander.fstore.pages;

import java.io.Serializable;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class ContactUsModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String sender;
	private String subject;
	private String message;
	
	private ContactUsModel() {
	}
	
	public static ContactUsModel createForNew() {
		return new ContactUsModel();
	}
	
	public void send() {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
 
		Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("kargov.nedyalko@gmail.com","krusha01");
				}
			});
 
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(this.sender));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("nka@avaleo.net"));
			message.setSubject(this.subject);
			message.setText(this.message);
			Transport.send(message);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
	
	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
