
import org.junit.jupiter.api.Test;
import org.example.FactorialCalc;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(-1,FactorialCalc.factorial(-1));
    }
    @Test
    void testHundredResult() {
        assertEquals(-1,FactorialCalc.factorial(100));
    }


}
