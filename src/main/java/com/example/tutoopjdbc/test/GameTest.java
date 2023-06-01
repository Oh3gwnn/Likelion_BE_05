package com.example.tutoopjdbc.test;

import com.example.tutoopjdbc.service.OpGame;
import com.example.tutoopjdbc.service.PlusOperatorLevelOne;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author jun
 *
 * 1. 덧셈
 * 2. 기회 3회
 * 3. 격려
 * 4. 결과 10 이하
 *
 * **/
public class GameTest {


    @Test
    public void test() {
        OpGame game = new OpGame(new PlusOperatorLevelOne());
        game.makeQuestion();
        String question = game.getQuestion();

        assertEquals("1 + 1 = ", question);
        assertEquals(3, game.getRemainingAnswers());
        assertEquals(false, game.isAnswer(3));
        assertEquals(2, game.getRemainingAnswers());
        assertEquals("한번 더 해보자", game.getCheeringUpMsg());
        assertEquals(true, game.isAnswer(2));

    }

    @Test
    public void testSumMax() {
        int max = 10;
        int a = (int)(Math.random() * max);
        int b = (int)(Math.random() * (max - a));
        System.out.printf("%d + %d = %d", a, b, a+b);
        assertTrue(a + b < 10);
    }
}
