package org.kata;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Beneficiary {
    private String name;
    private double amount;
}
