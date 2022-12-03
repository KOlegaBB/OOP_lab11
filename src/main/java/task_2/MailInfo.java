package task_2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MailInfo {
    private MailCode mailCode;
    private Client client;

    public String generate(){
        return mailCode.generate(client);
    }
}
