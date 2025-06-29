package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionTest {

    @Test
    public void testAssertion() {
        assertEquals(5, 2 + 3);

        assertTrue(5 > 3);

        assertFalse(5 < 3);

        String str = null;
        assertNull(str);

        String name = "JUnit";
        assertNotNull(name);
    }
}
