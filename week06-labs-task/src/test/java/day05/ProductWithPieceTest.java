package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductWithPieceTest {

    @Test
    void incrementCountTest() {
        ProductWithPiece pwp = new ProductWithPiece(Type.BAKERY);
        pwp.incrementCount();
        assertEquals(2, pwp.getCount());
    }

}