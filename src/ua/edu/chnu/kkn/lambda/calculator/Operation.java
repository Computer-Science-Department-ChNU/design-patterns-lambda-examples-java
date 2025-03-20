package ua.edu.chnu.kkn.lambda.calculator;

@FunctionalInterface
public interface Operation {

    double invoke(double operand1, double operand2);
}
