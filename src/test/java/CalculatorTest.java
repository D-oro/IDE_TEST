//Create a Calculator class. This should have functions for Add, Subtract, Multiply and Divide.
//Your methods should take in two ints to perform the calculations on
// (except the Divide method. This should take two doubles as arguments).
// add (5+5=10), subtract(10-5=5), multiply(3*3=9), divide(10/5=2.0)
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){assertEquals(12, calculator.Addition(10, 2));}

    @Test
    public void canSubtract(){assertEquals(8, calculator.Subtract(10, 2));}

    @Test
    public void canMultiply(){assertEquals(20, calculator.Multiply(10, 2));}

    @Test
    public void canDivide(){assertEquals(5.0, calculator.Divide(10.0, 2.0), 0.0);}
}