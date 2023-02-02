package com.example.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {


    @Test
    public void createUserWithCorrectValues(){
        User user = new User("u1","e1@g.com");
        Assertions.assertEquals("u1",user.getLogin());
        Assertions.assertEquals("e1@g.com",user.getEmail());
    }

    @Test
    public void createUserWithoutValues(){
        User user = new User();
        Assertions.assertEquals("defaultLogin",user.getLogin());
        Assertions.assertEquals("defaultEmail",user.getEmail());
    }

    @Test
    public void createUserWithCorrectEmail(){
        User user = new User("u1","e1@g.com");
        Assertions.assertTrue(user.getEmail().contains("@"));
    }

    @Test
    public void createUserWithSimilarValues(){
        User user = new User("e1","e1@g.com");
        Assertions.assertEquals("e1",user.getLogin());
        Assertions.assertEquals("e1@g.com",user.getEmail());
        Assertions.assertNotEquals(user.getLogin(),user.getEmail());
    }



}
