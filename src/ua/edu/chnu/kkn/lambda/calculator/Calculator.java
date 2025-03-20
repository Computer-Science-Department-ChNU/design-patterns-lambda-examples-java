package ua.edu.chnu.kkn.lambda.calculator;

public class Calculator {

    public double doCalc(double operand1, double operand2, Operation operation) {
        return operation.invoke(operand1, operand2);
    }
}
