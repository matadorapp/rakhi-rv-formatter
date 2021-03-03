package com.formatter;

public class FormatFactory {

    public FormatStrategy getFormatter(String formatType) {
        if ("left".equalsIgnoreCase(formatType))
            return new FormatLeft();
        else if ("right".equalsIgnoreCase(formatType))
            return new FormatRight();
        else if ("center".equalsIgnoreCase(formatType))
            return new FormatCenter();
        else return null;
    }
}
