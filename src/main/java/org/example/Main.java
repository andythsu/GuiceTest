package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.example.modules.AdvancedCalculatorModule;
import org.example.modules.CalculatorModule;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(
                new CalculatorModule(),
                new AdvancedCalculatorModule()
        );
        School school = injector.getInstance(School.class);
        System.out.println(school.add(1,2));
    }
}