package Test;

import Data.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.sumOperation(10, 20));
        System.out.println(calculator.substractOperation(20, 10));
        System.out.println(calculator.multiplicationOperation(30, 10));
        System.out.println(calculator.divisionOperation(30, 3));

    }
}
