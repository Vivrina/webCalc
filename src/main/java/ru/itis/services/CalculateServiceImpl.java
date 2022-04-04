package ru.itis.services;

import org.springframework.stereotype.Service;
import ru.itis.calculator.Calculator;

@Service
public class CalculateServiceImpl implements CalculateService{

    @Override
    public String calculate(String[] args) {
        return Calculator.calculate(args);
    }
}
