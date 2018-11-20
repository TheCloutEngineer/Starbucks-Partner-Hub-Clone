package com.schedule.BaristaBoard.Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    User user = new Administrator((long) 24345332, "Ryan", "Jamison", "p@ssw0rd" );

    @Test
    public void setId() {
        long x = 24345332;
        user.setId(user.id);

        long expected = x;
        long actual = user.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void setFirstName() {
        String name = "Ryan";
        user.setFirstName(user.firstName);

        String expected = name;
        String actual = user.getFirstName();

        assertEquals(expected, actual);
    }

    @Test
    public void setLastName() {
        String name = "Jamison";
        user.setLastName(user.lastName);

        String expected = name;
        String actual = user.getLastName();

        assertEquals(expected, actual);
    }

    @Test
    public void setPassword() {
        String password = "p@ssw0rd";
        user.setPassword(user.password);

        String expected = password;
        String actual = user.getPassword();

        assertEquals(expected, actual);
    }
}