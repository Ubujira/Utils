package me.insanitydev.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void clamp() {
        assertEquals(20, MathUtils.clamp(20, 0, 100));
        assertEquals(100, MathUtils.clamp(120, 0, 100));
        assertEquals(0, MathUtils.clamp(-5, 0, 100));
        assertEquals(50, MathUtils.clamp(50, 0, 100));
    }

    @Test
    void isInRange() {
        assertTrue(MathUtils.isInRange(20, 0, 100));
        assertTrue(MathUtils.isInRange(88, 20, 250));
        assertFalse(MathUtils.isInRange(155, 0, 100));
        assertFalse(MathUtils.isInRange(19, 20, 250));
    }
}