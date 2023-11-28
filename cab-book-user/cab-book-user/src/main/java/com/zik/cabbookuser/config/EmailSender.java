package com.zik.cabbookuser.config;

import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.*;
import java.util.Properties;
@Service
public class EmailSender {
//   public  void sendEmail(String location) {
//        final String username = "################";
//        final String password = "##################";
//
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//
//        Session session = Session.getInstance(props,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//
//        try {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(username));
//            // Multiple recipients separated by commas
//            String[] recipients = {"olasunkanmizik@gmail.com", "recipient2@example.com", "recipient3@example.com"};
//            InternetAddress[] addresses = new InternetAddress[recipients.length];
//            for (int i = 0; i < recipients.length; i++) {
//                addresses[i] = new InternetAddress(recipients[i]);
//            }
//            message.setRecipients(Message.RecipientType.TO, addresses);
//
//            message.setSubject("Driver Location");
//            message.setText(location);//
//            File htmlTemplateFile = new File("C:\\Users\\sansh\\Downloads\\cab-book-user\\cab-book-user\\src\\main\\resources\\templates\\invoice_template.html");
//            BufferedReader br = new BufferedReader(new FileReader(htmlTemplateFile));
//            StringBuilder content = new StringBuilder();
//            String line;
//            while ((line = br.readLine()) != null) {
//                content.append(line);
//            }
//            br.close();
//            message.setContent(content.toString(),"text/html");// Set Kafka message as email content
//
//            Transport.send(message);
//            System.out.println("Email sent successfully");
//        } catch (MessagingException e) {
//            throw new RuntimeException(e);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//   }
}
