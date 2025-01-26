package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Testing {

    @Test
    void testCalcOne() {
        assertEquals(2, FactorialCalc.factorial(2));
    }

    @Test
    void testCalcZero() {
        assertEquals(1, FactorialCalc.factorial(0));
    }

    @Test
    void testBelowZeroResult() {
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalc.factorial(-1);
        });

        assertEquals("Невозможно вычислить факториал для числа -1", exception1.getMessage());
    }

    @Test
    void testHundredResult() {
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalc.factorial(25);
        });

        assertEquals("Невозможно вычислить факториал для числа 25", exception1.getMessage());
    }


}
