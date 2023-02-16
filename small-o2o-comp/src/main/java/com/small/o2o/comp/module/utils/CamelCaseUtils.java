package com.small.o2o.comp.module.utils;

public final class CamelCaseUtils {

    private static final char SEPARATOR = '_';

    private CamelCaseUtils() {
    }

    public static String toCamelCase(String input) {
        if (input == null) {
            return null;
        }
        input = input.toLowerCase();
        int length = input.length();

        StringBuilder sb = new StringBuilder(length);
        boolean upperCase = false;
        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if (c == SEPARATOR) {
                upperCase = true;
            } else if (upperCase) {
                sb.append(Character.toUpperCase(c));
                upperCase = false;
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

}

