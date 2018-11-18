package com.schedule.BaristaBoard.Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    Administrator user = new Administrator();

    @Test
    public void setId() {
        long x = 24345332;
        user.setId(x);

        long expected = x;
        long actual = user.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void setFirstName() {
        String name = "Ryan";
        user.setFirstName(name);

        String expected = name;
        String actual = user.getFirstName();

        assertEquals(expected, actual);
    }

    @Test
    public void setLastName() {
        String name = "Jamison";
        user.setLastName(name);

        String expected = name;
        String actual = user.getLastName();

        assertEquals(expected, actual);
    }

    @Test
    public void setPassword() {
        String password = "p@ssw0rd";
        user.setPassword(password);

        String expected = password;
        String actual = user.getPassword();

        assertEquals(expected, actual);
    }
}