package com.formatter;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

public class FormatCenter implements FormatStrategy {

    public String format(String text, Integer width) {
        List<String> lines = FormatterUtil.buildLines(text, width);
        return lines.stream()
                .map(line -> StringUtils.center(line, width))
                .collect(Collectors.joining("\n"));
    }
}
