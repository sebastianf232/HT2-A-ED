import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.*;



public class CalculatorTesting {
    CalculatorG3 calc = new CalculatorG3();
    StackG3 st = new StackG3();

    @Test
    void testCalculate() throws Exception {
        assertEquals(Math.abs(Math.log(0)), this.calc.calculate());

    }
    
    @Test
    void testEmpty() throws Exception {
        assertEquals(expected, actual);
    }

    
    
}
