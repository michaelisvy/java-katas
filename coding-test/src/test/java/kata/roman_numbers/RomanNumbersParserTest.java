package kata.roman_numbers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class RomanNumbersParserTest {

    private RomanNumbersParser parser = new RomanNumbersParser();

    @Test
    public void parseII() {
        int result = parser.parse("II");
        assertThat(result).isEqualTo(2);
    }
}
