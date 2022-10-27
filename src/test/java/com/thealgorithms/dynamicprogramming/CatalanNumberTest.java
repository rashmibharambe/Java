package com.thealgorithms.conversions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CatalanNumberTest {

    @Test
    public void testCatalanNumber {
        assertEquals(14, CatalanNumber.findNthCatalan(5));
        assertEquals(16796, CatalanNumber.findNthCatalan(11));
    }
}
