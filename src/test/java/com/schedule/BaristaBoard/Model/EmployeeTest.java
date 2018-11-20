package com.schedule.BaristaBoard.Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {
    User user = new Employee((long) 24332, "Clement", "Ojie", "Clemisthe^&Best1" );

    @Test
    public void setId() {
        long x = 24332;
        user.setId(user.id);

        long expected = x;
        long actual = user.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void setFirstName() {
        String name = "Clement";
        user.setFirstName(user.firstName);

        String expected = name;
        String actual = user.getFirstName();

        assertEquals(expected, actual);
    }

    @Test
    public void setLastName() {
        String name = "Ojie";
        user.setLastName(user.lastName);

        String expected = name;
        String actual = user.getLastName();

        assertEquals(expected, actual);
    }

    @Test
    public void setPassword() {
        String password = "Clemisthe^&Best1";
        user.setPassword(user.password);

        String expected = password;
        String actual = user.getPassword();

        assertEquals(expected, actual);
    }
}

