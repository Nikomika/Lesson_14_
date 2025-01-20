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
    void testStringResult() {
        Assert.assertEquals(FactorialCalc.factorial(-1), -1);

    }
}
