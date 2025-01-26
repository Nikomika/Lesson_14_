package org.example;

public class FactorialCalc {

    public static long factorial(int number) {
        if (number < 0 || number > 20) {
            throw new IllegalArgumentException("Невозможно вычислить факториал для числа " + number);
        }
        if (number == 0 || number == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}

