package ua.edu.chnu.kkn.lambda;

import ua.edu.chnu.kkn.lambda.calculator.*;
import ua.edu.chnu.kkn.lambda.listener.Button;
import ua.edu.chnu.kkn.lambda.listener.ButtonListener;
import ua.edu.chnu.kkn.lambda.listener.ButtonListenerImpl;

public class Main {

    public static void main(String[] args) {
        testClickListener();
        testCalculator();
    }

    private static void testClickListener() {
        var button = new Button();
        //1. concrete implementation
        button.setButtonListener(new ButtonListenerImpl());
        button.click();
        //2. anonymous class
        button.setButtonListener(new ButtonListener() {
            @Override
            public void onCLick() {
                System.out.println("onCLick 2");
            }
        });
        button.click();
        //3. lambda expressions
        button.setButtonListener(() -> System.out.println("onCLick 3"));
        button.click();
        //4. method references
        button.setButtonListener(Main::onClickStatic);
        button.click();
    }

    private static void onClickStatic() {
        System.out.println("onCLick 4");
    }

    private static void testCalculator() {
        Calculator calculator = new Calculator();
        // 1. concrete implementation
        System.out.println(calculator.doCalc(4, 5, new Addition()));
        System.out.println(calculator.doCalc(4, 5, new Subtract()));
        System.out.println(calculator.doCalc(4, 5, new Multiply()));
        System.out.println(calculator.doCalc(4, 5, new Division()));
        // 2. lambda expressions
        Operation subtract = (a1, a2) -> a1 - a2;
        System.out.println(calculator.doCalc(4, 5, Double::sum));
        System.out.println(calculator.doCalc(4, 5, subtract));
        System.out.println(calculator.doCalc(4, 5, (a1, a2) -> a1 * a2));
        System.out.println(calculator.doCalc(4, 5, (a1, a2) -> a1 / a2));
    }
}
