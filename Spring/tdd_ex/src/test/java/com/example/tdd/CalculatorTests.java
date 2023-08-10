package com.example.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {
    private Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void additionTest() {
        // import static org.junit.jupiter.api.Assertions.*;
        assertEquals(5, calculator.add(2, 3));
        assertEquals(6, calculator.add(1, 2, 3));
        assertNotEquals(5, calculator.add(3, 3));
    }

    @Test
    public void subtractionTest() {
        assertEquals(3, calculator.sub(5, 2));
        assertNotEquals(1, calculator.sub(5, 3));
    }

    @Test
    public void multipleTest() {
        assertEquals(6, calculator.mul(3, 2));
        assertNotEquals(8, calculator.mul(3, 3));
    }

    @Test
    public void divisionTest() {
        assertEquals(3, calculator.div(6, 2));
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> calculator.div(6, 0));
        assertEquals("division by zero", exception.getMessage());
    }

    private class Calculator {
        public int add(int ...numbers) {
            int sum = 0;
            for (int i : numbers) {
                sum += i;
            }
            return sum;
        }

        public int sub(int a, int b) {
            return a-b;
        }

        public int mul(int a, int b) {
            return a*b;
        }

        public int div(int a, int b) {
            if (b == 0)
                throw new IllegalArgumentException("division by zero");
            else return a/b;
        }
    }
}
