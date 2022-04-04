package ru.itis.calculator;

import javafx.util.Pair;
import ru.itis.calculator.models.CalcModel;

public class Calculator {
    public static String calculate(String[] args) {
        Pair<CalcModel, String> parsedResult = Parser.parse(args);
        CalcModel calcModel = parsedResult.getKey();
        if(calcModel != null){
            int result = 0;
            switch (calcModel.getOperation()) {
                case "+":
                    result = calcModel.getValueOne() + calcModel.getValueTwo();
                    break;
                case "-":
                    result = calcModel.getValueOne() - calcModel.getValueTwo();
                    break;
                case "/":
                    try{
                        result = calcModel.getValueOne() / calcModel.getValueTwo();
                    }catch(ArithmeticException e) {
                        return "You cannot divide by zero!";
                    }
                    break;
                case "*":
                    result = calcModel.getValueOne() * calcModel.getValueTwo();
                    break;

            }
            return "Result: " + result;
        }else{
            return parsedResult.getValue();
        }
    }
}

