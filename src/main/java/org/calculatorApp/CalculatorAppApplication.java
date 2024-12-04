package org.calculatorApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorAppApplication {
    public static void main(String[] args) {
        System.out.println("Inside CalculatorAppApplication. Main class.");
        SpringApplication.run(CalculatorAppApplication.class, args);
    }
}