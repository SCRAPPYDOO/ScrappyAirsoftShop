/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import global.GlobalParameters;
import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import utils.Log;
/**
 *
 * @author SCRAPPYDOO
 */
public class MailSender {
    public static boolean sendMail() {
        return sendMail(new MailMessage());        
    }

    public static boolean sendMail(MailMessage emailMessage) {
        // Recipient's email ID needs to be mentioned.
        String to = emailMessage.getToEmail();//change accordingly
        String toName = emailMessage.getFromName();
        
        // Sender's email ID needs to be mentioned
        String from = GlobalParameters.EMAIL;
        final String username = GlobalParameters.EMAIL_USERNAME;
        final String password = GlobalParameters.EMAIL_PASSWORD;

        // Assuming you are sending email through relay.jangosmtp.net
        String host = GlobalParameters.EMAIL_HOST;

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        // Get the Session object.
        Session session = Session.getInstance(props,
        new javax.mail.Authenticator() {
           @Override
           protected PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication(username, password);
           }
        });

        try {
           // Create a default MimeMessage object.
           Message message = new MimeMessage(session);

           // Set From: header field of the header.
           message.setFrom(new InternetAddress(from, toName));
           
           // Set To: header field of the header.
           message.setRecipients(Message.RecipientType.TO,
           InternetAddress.parse(to));

           // Set Subject: header field
           message.setSubject(emailMessage.getSubject());

           // Now set the actual message
           message.setText(emailMessage.getMessage());

           // Send message
           Transport.send(message);

           Log.email("Sent message successfully....");

        } catch (MessagingException e) {           
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(MailSender.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return true;
    }
}
