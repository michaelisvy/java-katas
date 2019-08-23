import org.junit.Test;

public class IncomeCalculatorTest {


    @Test
    public void shouldRunWithCorrectExpectedValue() {
        IncomeCalculator incomeCalculator = new IncomeCalculator(4000000);
        double expectedResult = 2400000;
        double actualResult = incomeCalculator.calculateTax();
        if(expectedResult==actualResult){
            System.out.print("Pass");
        }

    }


}