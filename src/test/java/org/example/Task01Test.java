package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task01Test {
    @Test
    public void getCurrentFloor() {
        assertEquals(Task01.getCurrentFloor("(())"), 0);
        assertEquals(Task01.getCurrentFloor("()()"), 0);
        assertEquals(Task01.getCurrentFloor("((("), 3);
        assertEquals(Task01.getCurrentFloor("(()(()("), 3);
        assertEquals(Task01.getCurrentFloor("))((((("), 3);
        assertEquals(Task01.getCurrentFloor("())"), -1);
        assertEquals(Task01.getCurrentFloor("))("), -1);
        assertEquals(Task01.getCurrentFloor(")))"), -3);
        assertEquals(Task01.getCurrentFloor(")())())"), -3);
    }
}