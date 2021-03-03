package com.formatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatCenterTest {

    private FormatCenter formatCenter;

    @BeforeEach
    void setUp() {
        this.formatCenter = new FormatCenter();
    }

    @Test
    void formatWidth10() {
        //given
        String text = "This text should be center aligned";

        //when
        String formattedText = formatCenter.format(text, 10);

        //then
        assertEquals("This text \nshould be \n  center  \n aligned  ", formattedText);
    }

    @Test
    void formatWidth20() {
        //given
        String text = "This text should be center aligned ";

        //when
        String formattedText = formatCenter.format(text, 20);

        //then
        assertEquals("This text should be \n   center aligned   ", formattedText);
    }
}