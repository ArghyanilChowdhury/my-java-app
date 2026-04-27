package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAddNumbers() {
        App app = new App();

        int result = app.addNumbers(10, 20);

        assertEquals(30, result);
    }

    @Test
    public void testGetMessage() {
        App app = new App();

        String message = app.getMessage();

        assertEquals("Hello, Jenkins Maven Pipeline!", message);
    }
}