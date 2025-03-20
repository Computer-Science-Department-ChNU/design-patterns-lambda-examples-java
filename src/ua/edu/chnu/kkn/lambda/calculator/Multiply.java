package ua.edu.chnu.kkn.lambda.calculator;

public class Multiply implements  Operation {

    @Override
    public double invoke(double operand1, double operand2) {
        return operand1 * operand2;
    }
}
