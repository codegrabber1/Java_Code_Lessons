package task6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FixedStaff extends Staff implements IWage{
    private double fixSalaryPerHour; // paying/hour.
    private int countOfWorkHoursPerDay;
    final float pdf = 0.18f; // PDF.
    final float mc = 0.015f; // Military collection.



    public FixedStaff(
            String name,
            String position, String department,
            double fixSalaryPerHour, int countOfWorkHoursPerDay, int setMonthForCountDays){
        super(name,position,department,setMonthForCountDays);
        this.fixSalaryPerHour = fixSalaryPerHour;
        this.countOfWorkHoursPerDay = countOfWorkHoursPerDay;
    }

    public void workerName(){
        System.out.println(super.toString());
    }

    @Override
    public void calculateSalary(double pdf, double mc) {
        int countOfWeekDays = 8;
        int d = super.getCountOfDays() - countOfWeekDays;
        double salary = d * this.countOfWorkHoursPerDay * this.fixSalaryPerHour;
        BigDecimal dec = BigDecimal.valueOf(salary).setScale(2, RoundingMode.HALF_DOWN);

        System.out.print(super.toString() +
                " Зарплата:  " + dec + "грн.");

        double withoutPdf = salary * this.pdf;
        double withoutMc = salary * this.mc;
        double onHands = salary - withoutPdf - withoutMc;
        BigDecimal decHands = BigDecimal.valueOf(onHands).setScale(2, RoundingMode.HALF_DOWN);
        System.out.println(
                " З урахуванням ПДФ та ВС :  " + decHands + "грн.");
    }
}
