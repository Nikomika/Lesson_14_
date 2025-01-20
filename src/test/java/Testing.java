import org.example.FactorialCalc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {

    @Test
    void testCalcOne() {
        Assert.assertEquals(FactorialCalc.factorial(2), 2);
    }

    @Test
    void testCalcZero() {
        Assert.assertEquals(FactorialCalc.factorial(0), 1);
    }

    @Test
    void testBelowZeroResult() {
        Assert.assertEquals(FactorialCalc.factorial(-1), -1);

    }
    @Test
    void testHundredResult() {
        Assert.assertEquals(FactorialCalc.factorial(101), -1);

    }
}
