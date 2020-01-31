package com.roman;

import com.roman.RomanNumbersConverter;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RomanNumbersConverterTest {

    private RomanNumbersConverter converter = new RomanNumbersConverter();

    @Test
    public void shouldConvertSimpleNumber() {
        String romanNumber = converter.convertToRomanNumber(1);
        Assertions.assertThat(romanNumber).isEqualTo("I");
    }

    @Test
    public void shouldConvertMoreComplexNumber2() {
        String romanNumber = converter.convertToRomanNumber(2);
        Assertions.assertThat(romanNumber).isEqualTo("II");
    }

    @Test
    public void shouldConvertMoreComplexNumber3() {
        String romanNumber = converter.convertToRomanNumber(3);
        Assertions.assertThat(romanNumber).isEqualTo("III");
    }
}
