package mail;

import javax.mail.*;
import java.io.IOException;
import java.util.Properties;

public class ReceiveMail {

    public static void main(String[] args) throws MessagingException, IOException {
        Properties properties = new Properties();
        properties.put("mail.pop3.host", "pop3.gmail.com");
        Session session = Session.getDefaultInstance(properties);

        Store store = session.getStore("pop3");
        store.connect("host", "username", "password");

        Folder inbox = store.getFolder("INBOX");
        inbox.open(Folder.READ_ONLY);

        Message[] messages = inbox.getMessages();
        for (int i = 0; i < messages.length; i++) {
            Message message = messages[i];
            System.out.println("---------------------------------");
            System.out.println("Email Number " + (i + 1));
            System.out.println("Subject: " + message.getSubject());
            System.out.println("From: " + message.getFrom()[0]);
            System.out.println("Text: " + message.getContent().toString());
        }

        inbox.close(false);
        store.close();

    }
}