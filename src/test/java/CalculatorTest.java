import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }



    @Test
    public void canAdd(){
        assertEquals(30, calculator.add(16, 14));
    }

    @Test
    public void canSubtract(){
        assertEquals(10, calculator.subtract(17, 7));
    }

    @Test
    public void canMultiply(){
        assertEquals( 20, calculator.multiply(4, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(2, calculator.divide(6.0, 3.0), 0.01);
    }


}
