package mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {

    public static void main(String[] args) throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getDefaultInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("sadsakj", "askjhasd");
            }
        });

        MimeMessage message = new MimeMessage(session);
        message.setFrom("pasodp@gmail.com");
        message.addRecipient(Message.RecipientType.TO, new InternetAddress("abc@gmail.com"));
        message.setSubject("ksladjasd");
        message.setText("kjdasjdhaskjd");

        Transport.send(message);
    }
}