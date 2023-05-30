package com.example.tutoopjdbc.out;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TSNGameTest {

    @Test
    void testis369() {
        assertEquals("773*", TSNGame.game369(773));
        TSNGame.game369(773);
    }
}