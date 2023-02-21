import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator cal;

    @BeforeEach
    public void setUp() {
        cal = new Calculator();
    }

    @Test
    void 덧셈() {
        assertEquals(7, cal.add(3, 4));
    }

    @Test
    void 뺄셈() {
        assertEquals(1, cal.subtract(5, 4));
    }

    @Test
    void 곱셈() {
        assertEquals(6, cal.multiply(2, 3));
    }

    @Test
    void 나눗셈() {
        assertEquals(2, cal.divide(8, 4));
    }

    @AfterEach
    public void tearDown() {
        cal = null;
    }
}