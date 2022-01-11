package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void test() {
        User user = new User();
        user.setName("Harry");
        user.setEmail("harrypmw@gmail.com");

        System.out.println(user);
        Assertions.assertEquals("Harry",user.getName());
    }

}