package com.formatter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormatterMain {

    public static void main(String[] args) throws IOException {
        Arguments arguments = new Arguments();
        arguments.setArguments(args);

        //Get formatter
        FormatFactory formatFactory = new FormatFactory();
        FormatStrategy formatStrategy = formatFactory.getFormatter(arguments.getAlignment());

        if (formatStrategy == null)
            throw new IllegalArgumentException("No formatter present for alignment " + arguments.getAlignment());

        //Read from console
        BufferedReader standardInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the text: ");
        String text = standardInput.readLine();

        //Format text
        System.out.println(arguments.getAlignment() + " align width " + arguments.getWidth());
        System.out.println(formatStrategy.format(text, arguments.getWidth()));
    }
}
