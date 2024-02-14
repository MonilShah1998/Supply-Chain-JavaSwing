/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.sendmail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Session;
import javax.mail.Transport;
import java.lang.String;
import static util.extras.Constants.EMAIL_SENDER_ALIAS;
import static util.extras.Constants.EMAIL_SENDER_PASSWORD;


/**
 *
 * @author rachanakeshav
 */
public class EmailUtil {
    
    public static void sendMail(String recepient,String subject,String body) throws MessagingException{
    
        Properties props = new Properties();
        
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        
        
       String sender = EMAIL_SENDER_ALIAS;
       String password = EMAIL_SENDER_PASSWORD;



      Session session = Session.getInstance(props, new Authenticator() {
           @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sender, password);
            }
        });
      
       Message message = prepareMessage(session, sender, recepient,subject,body);
    
       Transport.send(message);
       System.out.println("Message sent successfully");



}



//compose message
        private static Message prepareMessage(Session session, String sender, String recepient,String subject, String body){
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sender));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject(subject);
            message.setText(body);
            return message;
       } catch (Exception e) {
            System.out.println(e);
        }
        
        return null;
   }
    
}
