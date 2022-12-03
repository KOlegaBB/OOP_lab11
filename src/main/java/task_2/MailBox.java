package task_2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.*;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo){
        infos.add(mailInfo);
    }

    public void sendAll() throws MailjetSocketTimeoutException, MailjetException {
        for (MailInfo mail: infos){
            MailSender.sendMail(mail);
        }
        infos.clear();
    }

    public static void main(String[] args) throws MailjetSocketTimeoutException, MailjetException {
        MailBox mailBox = new MailBox();
        Client client_1 = new Client("Yaroslav", 18, Gender.MALE, "yaroslav.klym@ucu.edu.ua");
        MailCode mailCode = new BirthdayMail();
        MailInfo mailInfo = new MailInfo(mailCode, client_1);
        mailBox.addMailInfo(mailInfo);
        mailBox.sendAll();
    }
}
