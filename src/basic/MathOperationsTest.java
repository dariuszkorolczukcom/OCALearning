package src.basic;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathOperationsTest {

    @Test
    public void testAdd() {
        MathOperations myUnit = new MathOperations();
        int result = myUnit.add(1, 2);
        assertEquals(3, result);
    }
		
    @Test
    public void testSubtract() {
        MathOperations myUnit = new MathOperations();
        int result = myUnit.substract(3, 2);
        assertEquals(1, result);
    }
		
    @Test
    public void testMultiply() {
        MathOperations myUnit = new MathOperations();
        int result = myUnit.multiply(2, 2);
        assertEquals(4, result);
    }
		
    @Test
    public void testDivide() {
        MathOperations myUnit = new MathOperations();
        int result = myUnit.divide(4, 2);
        assertEquals(2, result);
    }
		
    @Test
    public void testModulo() {
        MathOperations myUnit = new MathOperations();
        int result = myUnit.modulo(5, 2);
        assertEquals(1, result);
    }
}