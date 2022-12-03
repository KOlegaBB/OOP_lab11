package task_2;

public class BirthdayMail implements MailCode{
    private static final String TEMPLATE = "Happy %AGE Birthday %NAME!!!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName()).replaceAll("%AGE",
                Integer.toString(client.getAge()));
    }
}
