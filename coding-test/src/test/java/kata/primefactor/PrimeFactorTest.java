package kata.primefactor;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorTest {

    PrimeFactor primeFactor = new PrimeFactor();

    @Test
    public void oneShouldReturnEmptyTable() {
        assertThat(primeFactor.primeFactor(1)).isEmpty();
    }

    @Test
    public void twoShouldReturnItself() {
        assertThat(primeFactor.primeFactor(2)).isEqualTo(new Integer[] {2});
    }

    @Test
    public void fourShouldReturnTwoMultipliers() {
        assertThat(primeFactor.primeFactor(4)).isEqualTo(new Integer[] {2,2});
    }

    @Test
    public void sixShouldReturnTwoMultipliersEvenWhenTwoPossibleCombinations() { // 3*2 or 2*3
        assertThat(primeFactor.primeFactor(6)).isEqualTo(new Integer[] {3,2});
    }
}
