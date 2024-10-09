package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void division() {
        assertEquals(2.5, Main.division(5,2));
    }

    @Test
    void multiplication() {
        assertEquals(25, Main.multiplication(5,5));
    }

    @Test
    void subtraction() {
        assertEquals(5, Main.subtraction(10,5));
    }

    @Test
    void addition() {
        assertEquals(7, Main.addition(5,2));
    }
}