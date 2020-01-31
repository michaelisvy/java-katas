package org.kata;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class HongBaoTest {
    private HongBaoCalculator hongBaoCalculator = new HongBaoCalculator();
    private static final Logger log = LoggerFactory.getLogger(HongBaoTest.class);

    // generateRandomNumbers: 20 min
    // adjustNumbersTotalOne: 20 min
    // returnListOfBeneficiaries: 20 min
    @Test
    public void shouldGenerateRandomNumbers() {
        double[] numbers = this.hongBaoCalculator.generateRandomNumbers(3);
        for (double number: numbers) {
            assertThat(number).isLessThan(1.0);
        }
    }

    @Test
    public void shouldCalculateWeightedValuesTotalOne() {
        double[] numbers = new double[] {0.5,0.9,0.7};
        double[] weightedValues = this.hongBaoCalculator.calculateWeightedValuesTotalOne(numbers);
        double total = 0;
        for (double value: weightedValues) {
            total += value;
        }
        assertThat(total).isCloseTo(1.0, offset(0.001));
    }

    @Test
    public void shouldCalculateBeneficiaries() {
        List<Beneficiary> beneficiaries = this.hongBaoCalculator.calculateBeneficiaries(200, "Melina", "Alicia", "Winnie");
        assertThat(beneficiaries.size()).isEqualTo(3);

        double total = 0;
        for(Beneficiary beneficiary: beneficiaries) {
            total += beneficiary.getAmount();
        }
        assertThat(total).isCloseTo(200.0, offset(0.001));
    }


}
