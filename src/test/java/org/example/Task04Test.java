package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task04Test {

    @Test
    public void getFrequency() {
        assertEquals(Task04.getFrequency("+1, -2, +3, +1"), 3);
        assertEquals(Task04.getFrequency("+1, +1, +1"), 3);
        assertEquals(Task04.getFrequency("+1, +1, -2"), 0);
        assertEquals(Task04.getFrequency("-1, -2, -3"), -6);
    }
}