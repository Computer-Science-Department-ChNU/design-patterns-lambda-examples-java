package ua.edu.chnu.kkn.lambda.calculator;

public class Calculator {

    public double doCalc(double a1, double a2, Operation operation) {
        return operation.invoke(a1, a2);
    }
}
