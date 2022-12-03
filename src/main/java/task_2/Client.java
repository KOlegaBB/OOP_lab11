package task_2;

import lombok.Getter;
import lombok.Setter;


enum Gender {
    MALE, FEMALE
}

public class Client {
    @Getter
    private int id;
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private int age;
    @Setter
    @Getter
    private Gender sex;

    @Setter
    @Getter
    private String email;
    private static int counter = 0;

    public Client(String name, int age, Gender sex, String email) {
        id = counter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }
}
