package com.demo.dojo.demodojo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanNumberEnconderTest {

    @Test
    void givenTheNumber1_shouldReturn_I() {
        RomanNumberEnconder encoder = new RomanNumberEnconder();

        String romanNumber = encoder.enconde(1);

        Assertions.assertEquals("I", romanNumber);
    }

}