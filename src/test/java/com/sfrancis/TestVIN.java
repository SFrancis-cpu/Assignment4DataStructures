package com.sfrancis;

import org.junit.Test;

import static com.sfrancis.VIN.getLucky;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestVIN {

    @Test
    public void testLucky() {
        assertEquals(7, getLucky());
    }
    }
