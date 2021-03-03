package com.formatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatLeftTest {

    private FormatLeft formatLeft;

    @BeforeEach
    void setUp() {
        this.formatLeft = new FormatLeft();
    }

    @Test
    void formatWidth10() {
        //given
        String text = "This text should be left aligned ";

        //when
        String formattedText = formatLeft.format(text, 10);

        //then
        assertEquals("This text \nshould be \nleft      \naligned   ", formattedText);
    }

    @Test
    void formatWidth20() {
        //given
        String text = "This text should be left aligned ";

        //when
        String formattedText = formatLeft.format(text, 20);

        //then
        assertEquals("This text should be \nleft aligned        ", formattedText);
    }
}