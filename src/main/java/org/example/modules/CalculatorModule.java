package org.example.modules;

import com.google.inject.AbstractModule;
import org.example.BasicCalculator;
import org.example.Calculator;

public class CalculatorModule extends AbstractModule
{
    protected void configure() {
        bind(Calculator.class)
                .annotatedWith(org.example.bindings.BasicCalculator.class)
                .to(BasicCalculator.class);
    }

//    @Provides
//    public Calculator calculator() {
//        return new BasicCalculator();
//    }
}

