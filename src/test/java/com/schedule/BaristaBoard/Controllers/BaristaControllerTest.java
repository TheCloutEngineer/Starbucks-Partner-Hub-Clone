package com.schedule.BaristaBoard.Controllers;

import com.schedule.BaristaBoard.Model.Barista;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaristaControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    Barista barista = new Barista();

    @Before
    public void setUp() throws Exception {

        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getBaristabyId() {

    }

    @Test
    public void getAllBarista() {
    }

    @Test
    public void createBarista() {
        barista.setFirstName("Khalil");
        barista.setLastName("Saboor");

    }

    @Test
    public void updateBarista() {
    }

    @Test
    public void deleteBarista() {
    }
}