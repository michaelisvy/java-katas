package challenge.tax;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class TaxService {

    private static final Map<Integer, Double> taxThresholds = new LinkedHashMap<>();

    private static final Map<Integer, Integer> reliefsFamilyMembers = new HashMap<>();

    static {
        taxThresholds.put(500000000, 0.30); // 500,000,000
        taxThresholds.put(250000000, 0.25); // 250,000,000
        taxThresholds.put(50000000, 0.15); // // 50,000,000
        taxThresholds.put(0, 0.05);

        reliefsFamilyMembers.put(1,54000000); // single - 54,000,000
        reliefsFamilyMembers.put(2,58500000); // married - 58,500,000
        reliefsFamilyMembers.put(3,63000000); // married with 1 kid - 63,000,000
        reliefsFamilyMembers.put(4,67500000); // married with 2 kids - 67,500,000
        reliefsFamilyMembers.put(5,72000000);// married with 3 kids -  - 72,000,000
    }



    public double calculateTax(double monthlySalary, int numberOfFamilyMembers) {
        double taxableIncome = calculateTaxableIncomeBasedOnTaxReliefs(monthlySalary, numberOfFamilyMembers);
        double taxAmount =  calculateTaxToBePaid(taxableIncome);
        return taxAmount;
    }




    private double calculateTaxToBePaid(Double taxableIncome) {
        double taxToBePaid = 0;

        for(Integer thresholdValue : taxThresholds.keySet()) {
            if (taxableIncome >= thresholdValue) {
                double topLayer = taxableIncome - thresholdValue;
                taxToBePaid += topLayer * taxThresholds.get(thresholdValue);
                taxableIncome -= topLayer;
            }
        }
        return taxToBePaid;
    }

    private double calculateTaxableIncomeBasedOnTaxReliefs(double monthlySalary, int numberOfFamilyMembers) {
        double annualSalary = monthlySalary * 12;
        double taxRelief;

        if (numberOfFamilyMembers == 0)
            throw new RuntimeException("you need at least one family member");
        else if(numberOfFamilyMembers >= 5)
            taxRelief = reliefsFamilyMembers.get(5);
        else
            taxRelief = reliefsFamilyMembers.get(numberOfFamilyMembers);

        return annualSalary - taxRelief;
    }
}