package org.example;

import com.google.inject.Inject;

public class AdvancedCalculator
        implements Calculator
{
    private final int factor;

    @Inject
    public AdvancedCalculator(Config config)
    {
        this.factor = config.getFactor();
    }

    @Override
    public int add(int a, int b)
    {
        return factor*(a+b);
    }
}
