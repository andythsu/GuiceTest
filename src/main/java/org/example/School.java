package org.example;

import com.google.inject.Inject;

public class School {
    private final Calculator calculator;

    @Inject
    public School(@org.example.bindings.AdvancedCalculator Calculator calculator) {
        this.calculator = calculator;
    }

    public int add(int a, int b) {
        return calculator.add(a, b);
    }
}
