
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

enum Gender {
    MALE, FEMALE
}

@SuperBuilder
@Getter
public class User extends Human{
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    @Singular
    private List<String> occupations;

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", age=" + age +
                ", gender=" + gender +
                ", weight=" + weight +
                ", height=" + height +
                ", occupations=" + occupations +
                '}';
    }
}