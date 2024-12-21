package org.example.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.example.AdvancedCalculator;
import org.example.Calculator;

public class AdvancedCalculatorModule extends AbstractModule
{
    protected void configure() {
        bind(Calculator.class)
                .annotatedWith(org.example.bindings.AdvancedCalculator.class)
                .to(AdvancedCalculator.class);
    }

//    @Provides
//    public Calculator calculator() {
//        return new AdvancedCalculator(10);
//    }
}
