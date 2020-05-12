package task6.com.lgs.lab.interface2;

import task6.com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
    @Override
    public double devide(double a, double b) {
        return a / b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int plus(int a, int b) {
        return a + b;
    }
}
