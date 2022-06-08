package open.bruveris.arturs.uzdevums;
import org.junit.jupiter.api.Assertions;


public class calculatorTest {
    @org.junit.jupiter.api.Test
    public void sumTest() {
        Assertions.assertEquals(3, calculator.sum(1,2));
    }

    @org.junit.jupiter.api.Test
    public void subTest() {
        Assertions.assertEquals(3, calculator.sub(6,3));
    }

    @org.junit.jupiter.api.Test
    public void multTest() {
        Assertions.assertEquals(3, calculator.multiply(1,3));
    }

    @org.junit.jupiter.api.Test
    public void divTest() {
        Assertions.assertEquals(3, calculator.div(9,3));
    }
}