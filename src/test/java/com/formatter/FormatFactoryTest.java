package com.formatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FormatFactoryTest {

    private FormatFactory formatFactory;

    @BeforeEach
    void setUp() {
        this.formatFactory = new FormatFactory();
    }

    @Test
    void getFormatterLeft() {
        //when
        FormatStrategy formatLeft = formatFactory.getFormatter("Left");

        //then
        Assertions.assertTrue(formatLeft instanceof FormatLeft);
    }

    @Test
    void getFormatterRight() {
        //when
        FormatStrategy formatRight = formatFactory.getFormatter("Right");

        //then
        Assertions.assertTrue(formatRight instanceof FormatRight);
    }

    @Test
    void getFormatterCenter() {
        //when
        FormatStrategy formatCenter = formatFactory.getFormatter("Center");

        //then
        Assertions.assertTrue(formatCenter instanceof FormatCenter);
    }
}