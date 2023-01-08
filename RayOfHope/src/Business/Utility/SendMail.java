/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utility;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 * Send Mail Functionality added
 * @author shwetabulchandani
 */
public class SendMail {
    
    public static void sendEmailMessage(String emailId, String sub, String text) throws UnsupportedEncodingException {
        String to = emailId;
        
        String from="rayofhopeneu@gmail.com";
        String fromname="RAY OF HOPE";
        String SMTP_USERNAME  = "AKIASF5ZCCWGGL3XSBW4";
        String pass = "BNFNwrjqCp2WaZNUa41kCsWhA7yKl6QT40YjBhOLXYFW";
        String subject=sub;

        Properties properties = System.getProperties();
        String host = "email-smtp.us-east-1.amazonaws.com";

        properties.put("mail.smtp.starttls.enable", "true");

        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.ssl.protocols","TLSv1.2");
        properties.put("mail.smtp.user", from);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from,fromname));
            message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            //message.setContent(BODY,"text/html");
            message.setText(text);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, SMTP_USERNAME, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
        }
    }
    
    
    
}
