package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task05Test {

    @Test
    public void getResult() {
        assertEquals(Task05.getResult("1721\n" + "979\n" + "366\n" + "299\n" + "675\n" + "1456"), 514579);
    }
}