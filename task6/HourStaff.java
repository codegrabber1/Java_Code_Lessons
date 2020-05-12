package task6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HourStaff extends Staff implements IWage{
    private double salaryPerHour;
    private int countOfHoursInDay ;
    final double pdf = 0.18; // PDF.
    final double mc = 0.015; // Military collection.

    public HourStaff(
            String name,
            String position, String department,
            int setMonthForCountDays, double salaryPerHour, int countOfHoursInDay){
        super(name,position, department, setMonthForCountDays);
        this.salaryPerHour = salaryPerHour;
        this.countOfHoursInDay = countOfHoursInDay;
    }


    @Override
    public void calculateSalary( double pdf, double mc) {
        int countOfWeekDays = 8;
        int d = super.getCountOfDays() - countOfWeekDays;

        double salary = d * this.countOfHoursInDay * this.salaryPerHour - this.pdf - this.mc;
        BigDecimal dec = BigDecimal.valueOf(salary).setScale(2, RoundingMode.HALF_DOWN);

        System.out.print(super.toString() +
                " Зарплата:  " + dec + "грн.");

        double withoutPdf = salary * this.pdf;
        double withoutMc = salary * this.mc;
        double onHands = salary - withoutPdf - withoutMc;
        BigDecimal decHands = BigDecimal.valueOf(onHands).setScale(2, RoundingMode.HALF_DOWN);
        System.out.println(
                " З ПДФ та ВС :  " + decHands + "грн.");
    }
}
