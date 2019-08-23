package kata.roman_numbers;

import org.springframework.util.StringUtils;

import java.util.ArrayList;

public class RomanNumbersParser {

    private static final String UNIT = "I";

    public int parse(String romanNumber) {
        return StringUtils.countOccurrencesOf(romanNumber, UNIT);


    }
}
