package ru.itis.calculator;

import javafx.util.Pair;
import ru.itis.calculator.models.CalcModel;

public class Parser {
    public static Pair<CalcModel, String> parse(String[] args) {
        if (args.length != 3) {
            return new Pair(null, "Arg format is: val1 +|-|*|/ val2");
        }

        int valueOne;
        try {
            valueOne = Integer.parseInt(args[0]);
        }catch (NumberFormatException e){
            return new Pair(null, "Val1 is not int");
        }

        int valueTwo;
        try {
            valueTwo = Integer.parseInt(args[2]);
        }catch (NumberFormatException e){
            return new Pair(null, "Val2 is not int");
        }

        String operator = args[1];

        if(!operator.equals("+") && !operator.equals("-") && !operator.equals("/") && !operator.equals("*")){
            return new Pair(null, "Operator not found");
        }
        CalcModel calcModel = new CalcModel(valueOne, valueTwo, operator);
        return new Pair(calcModel, null);
    }
}
