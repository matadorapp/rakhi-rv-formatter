package com.formatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class FormatterUtil {

    public static List<String> buildLines(String text, Integer width) {
        List<String> lines = new ArrayList<>();
        lines.add("");
        Pattern.compile(" ").splitAsStream(text)
                .forEach(word -> splitOrMergeWords(width, lines, word));
        return lines;
    }

    private static void splitOrMergeWords(Integer width, List<String> lines, String word) {
        if (word.length() > width) {
            lines.addAll(Arrays.asList(word.split(String.format("(?<=\\G.{%d})", width))));
        } else if ((lines.get(lines.size() - 1).length() + word.length() + 1) < width) {
            splitWord(lines, word);
        } else {
            lines.add(word);
        }
    }

    private static void splitWord(List<String> lines, String word) {
        StringBuilder stringBuilder = new StringBuilder(lines.get(lines.size() - 1));
        if (!stringBuilder.toString().isEmpty()) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(word);
        lines.remove(lines.size() - 1);
        lines.add(stringBuilder.toString());
    }
}
