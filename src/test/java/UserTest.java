import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class UserTest {
    private User user_1, user_2, user_3, user_4;

    @BeforeEach
    public void init() {
        user_1 = User.builder().name("Yaroslav").age(18).gender(Gender.MALE).weight(60).height(177).occupation("UCU")
                .build();
        user_2 = User.builder().name("Ivan").gender(Gender.MALE).age(18).build();
        user_3 = User.builder().name("Oles").gender(Gender.MALE).age(31).occupation("UCU").build();
        user_4 = User.builder().build();
    }

    @Test
    public void testUser1() {
        Assertions.assertEquals(user_1.getName(), "Yaroslav");
        Assertions.assertEquals(user_1.getAge(), 18);
        Assertions.assertEquals(user_1.getGender(), Gender.MALE);
        Assertions.assertEquals(user_1.getWeight(), 60);
        Assertions.assertEquals(user_1.getHeight(), 177);
        Assertions.assertEquals(user_1.getOccupations().get(0), "UCU");
        Assertions.assertEquals(user_1.toString(), "User{name=Yaroslav, age=18, gender=MALE, weight=60.0, " +
                "height=177.0, occupations=[UCU]}");
    }

    @Test
    public void testUser2() {
        Assertions.assertEquals(user_2.getName(), "Ivan");
        Assertions.assertEquals(user_2.getAge(), 18);
        Assertions.assertEquals(user_2.getGender(), Gender.MALE);
        Assertions.assertEquals(user_2.getWeight(), 0);
        Assertions.assertEquals(user_2.getHeight(), 0);
        List<String> list = new ArrayList<String>();
        Assertions.assertEquals(user_2.getOccupations(), list);
        Assertions.assertEquals(user_2.toString(), "User{name=Ivan, age=18, gender=MALE, weight=0.0, " +
                "height=0.0, occupations=[]}");
    }

    @Test
    public void testUser3() {
        Assertions.assertEquals(user_3.getName(), "Oles");
        Assertions.assertEquals(user_3.getAge(), 31);
        Assertions.assertEquals(user_3.getGender(), Gender.MALE);
        Assertions.assertEquals(user_3.getWeight(), 0);
        Assertions.assertEquals(user_3.getHeight(), 0);
        Assertions.assertEquals(user_3.getOccupations().get(0), "UCU");
        Assertions.assertEquals(user_3.toString(), "User{name=Oles, age=31, gender=MALE, weight=0.0, " +
                "height=0.0, occupations=[UCU]}");
    }

    @Test
    public void testUser4() {
        Assertions.assertNull(user_4.getName());
        Assertions.assertEquals(user_4.getAge(), 0);
        Assertions.assertNull(user_4.getGender());
        Assertions.assertEquals(user_4.getWeight(), 0);
        Assertions.assertEquals(user_4.getHeight(), 0);
        List<String> list = new ArrayList<String>();
        Assertions.assertEquals(user_4.getOccupations(), list);
        Assertions.assertEquals(user_4.toString(), "User{name=null, age=0, gender=null, weight=0.0, " +
                "height=0.0, occupations=[]}");
    }
}
