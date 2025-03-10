package com.example.democicd.testmethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMethodTest {

    @Test
    void testGreeting() {
        TestMethod testMethod = new TestMethod();
        assertEquals("Hello", testMethod.greeting());
    }
}