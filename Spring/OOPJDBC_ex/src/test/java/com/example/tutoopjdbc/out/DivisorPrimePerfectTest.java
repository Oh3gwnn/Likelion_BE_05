package com.example.tutoopjdbc.out;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorPrimePerfectTest {
    @Test
    void isTest() {
        assertEquals(6, DivisorPrimePerfect.isDivisor(18));
        assertEquals(true, DivisorPrimePerfect.isPrime(41));
        assertEquals(true, DivisorPrimePerfect.isPerfect(6));
    }
}