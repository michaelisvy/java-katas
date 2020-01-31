package com.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbersConverter {

    private static Map<Integer, String> romanConversionMap = new HashMap<>();

    static {
        romanConversionMap.put(1, "I");
    }

    public String convertToRomanNumber(int entryNumber) {
        if (entryNumber < 4) {
            String romanConversion = romanConversionMap.get(1);
            return buildNumber(entryNumber, romanConversion);
        }
        else throw new RuntimeException("not supported yet");
    }

    public String buildNumber(int number, String romanConversion) {
        String romanNumber = "";
        for (int i=1; i<=number; i++) {
            romanNumber += romanConversion;
        }
        return romanNumber;
    }
}
