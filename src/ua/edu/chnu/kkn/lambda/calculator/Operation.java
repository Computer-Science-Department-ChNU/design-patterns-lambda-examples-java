package ua.edu.chnu.kkn.lambda.calculator;

@FunctionalInterface
public interface Operation {

    double invoke(double a1, double a2);
}
