package day02.numbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerfectNumbersTest {

    PerfectNumbers pn = new PerfectNumbers();

    @Test
    void isPerfectNumberTestTrue() {
        assertEquals(true, pn.isPerfectNumber(6));
        assertEquals(true, pn.isPerfectNumber(8128));
        assertEquals(false, pn.isPerfectNumber(7246));
        assertEquals(false, pn.isPerfectNumber(9));
    }
}
