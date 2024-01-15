package de.tum.in.ase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class AddTest {
    @Test
    public void testAdd() {
        assertEquals(4, Add.add(2, 2));
    }
}