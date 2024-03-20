package ua.edu.chnu.kkn.lambda.calculator;

public class Subtract implements Operation {

    @Override
    public double invoke(double a1, double a2) {
        return a1 - a2;
    }
}
