package com.sfrancis;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLamp {

    @Test
    public void testLamp() {
        assertEquals("Positive", Lamp.getStatus());
    }
}