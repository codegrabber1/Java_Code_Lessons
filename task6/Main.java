package task6;

import task6.com.lgs.lab.interface2.MyCalculator;

public class Main {

    public static void main(String[] args){

        System.out.println("======= The salary of workers  =========");
        FixedStaff fw = new FixedStaff(
                "Steve", "Столяр",
                "Столярня",
                53.5d,
                8,4);


        fw.calculateSalary(fw.pdf,fw.mc);

        HourStaff hw = new HourStaff("John", "Sailor", "Ship",
                    5, 40, 12);
            hw.calculateSalary(hw.pdf, hw.mc);

        System.out.println("======= Calculating =========");

        MyCalculator calculator = new MyCalculator();

        char op = '+';

        int a = 4, b = 7;
        switch (op){
            case '+':
                System.out.println(calculator.plus(a,b));
                break;
            case '-':
                System.out.println(calculator.minus(a,b));
                break;
            case '*':
                System.out.println(calculator.multiply(a,b));
                break;
            case '/':
                if(b != 0) {
                    System.out.println(calculator.devide(a,b));

                } else {
                    System.out.println("You can't devide by zero! ");
                }
                break;

        }

        }


}
