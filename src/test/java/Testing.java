import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
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
    void testStringResult() {
        assertEquals(-1,FactorialCalc.factorial(-1));
    }


}
