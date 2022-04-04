package ru.itis.calculator.models;

public class CalcModel {
    private int valueOne;
    private int valueTwo;
    private String operation;

    public CalcModel(int valueOne, int valueTwo, String operation) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.operation = operation;
    }

    public int getValueOne() {
        return valueOne;
    }

    public void setValueOne(int valueOne) {
        this.valueOne = valueOne;
    }

    public int getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(int valueTwo) {
        this.valueTwo = valueTwo;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
