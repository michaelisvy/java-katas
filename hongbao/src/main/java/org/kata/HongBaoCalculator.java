package org.kata;

import java.util.*;

public class HongBaoCalculator {

    public List<Beneficiary> calculateBeneficiaries(double totalAmount, String... beneficiaryNames) {
        double[] randomNumbers = generateRandomNumbers(beneficiaryNames.length);
        double[] weightedValues = calculateWeightedValuesTotalOne(randomNumbers);
        List<Beneficiary> beneficiaries = buildBeneficiaries(totalAmount, weightedValues, beneficiaryNames);
        return beneficiaries;
    }

    protected double[] generateRandomNumbers(int size) {
        double[] randomNumbers = new double[size];
        for(int i=0; i<size; i++) {
            randomNumbers[i] = Math.random();
        }
        return randomNumbers;
    }

    protected double[] calculateWeightedValuesTotalOne(double[] numbers) {
        double total = Arrays.stream(numbers).sum();
        double[] weightedValues = new double[numbers.length];
        for(int i=0; i<weightedValues.length; i++) {
            weightedValues[i] = numbers[i] / total;
        }
        return weightedValues;
    }

    protected List<Beneficiary> buildBeneficiaries(double totalAmount, double[] weightedValues, String[] beneficiaryNames) {
        List<Beneficiary> beneficiaries = new ArrayList<>();

        for(int i = 0; i < weightedValues.length; i++) {
            beneficiaries.add(new Beneficiary(beneficiaryNames[i], totalAmount * weightedValues[i]));
        }
        return beneficiaries;
    }




}
