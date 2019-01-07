import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void canAdd() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void canSubtract(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(8, 5));

    }

    @Test
    public void canDivide(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.divide(6, 2));
    }

    @Test
    public void canMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(30, calculator.multiply(10, 3));
    }
}
