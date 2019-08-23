package challenge.tax;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TaxServiceTest {

    private TaxService taxService = new TaxService();


    @Test
    public void shouldCalculateTaxLayer1Married2Kids() {
        double taxAmount = taxService.calculateTax(4500000, 3);
        assertThat(taxAmount).isEqualTo(0);
    }

    @Test
    public void shouldCalculateTaxLayer2Single() {
        double taxAmount = taxService.calculateTax(25000000, 1);
        assertThat(taxAmount).isEqualTo(31900000);
    }

    @Test
    public void shouldCalculateTaxLayer2SpouseAnd2Kids() {
        double taxAmount = taxService.calculateTax(25000000, 4);
        assertThat(taxAmount).isEqualTo(29875000);
    }

    @Test
    public void shouldCalculateTaxLayer2WithSpouseAnd4Kids() {
        double taxAmount = taxService.calculateTax(25000000, 6);
        assertThat(taxAmount).isEqualTo(29200000);
    }

}
