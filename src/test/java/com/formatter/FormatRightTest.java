package com.formatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatRightTest {

    private FormatRight formatRight;

    @BeforeEach
    void setUp() {
        this.formatRight = new FormatRight();
    }

    @Test
    void formatWidth10() {
        //given
        String text = "This text should be right aligned ";

        //when
        String formattedText = formatRight.format(text, 10);

        //then
        assertEquals(" This text\n should be\n     right\n   aligned", formattedText);
    }

    @Test
    void formatWidth20() {
        //given
        String text = "This text should be right aligned ";

        //when
        String formattedText = formatRight.format(text, 20);

        //then
        assertEquals(" This text should be\n       right aligned", formattedText);
    }
}