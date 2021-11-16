package day02.numbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerfectNumbersTest {

    PerfectNumbers pn = new PerfectNumbers();

    @Test
    void isPerfectNumberTest() {
        assertTrue(pn.isPerfectNumber(6));
        assertTrue(pn.isPerfectNumber(8128));
        assertEquals(false, pn.isPerfectNumber(7246));
        assertEquals(false, pn.isPerfectNumber(9));
    }
}
