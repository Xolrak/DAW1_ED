package org.antonio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class TestBatalla {
    Luffy Luffy;
    Zoro Zoro;

    @Before
    public void setUp() {
        Luffy = new Luffy("Monkey D. Luffy", 100);
        Zoro = new Zoro("Roronoa Zoro", 80);
    }

    @Test
    public void testAtaqueLuffy() {
        Luffy.atacar(Zoro);
        assertEquals(-20, Zoro.getPoder());
        assertNotEquals(-33, Zoro.getPoder());
    }

    @Test
    public void testAtaqueZoro() {
        Zoro.atacar(Luffy);
        assertEquals(20, Luffy.getPoder());
        assertNotEquals(33, Luffy.getPoder());
    }
}
