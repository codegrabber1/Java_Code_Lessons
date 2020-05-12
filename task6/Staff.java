package task6;

import java.util.Calendar;

public class Staff {
    private String staffName;
    private String staffPosition;
    private String staffDepartment;
    private int setMonthForCountDays;

    public Staff(String name, String position, String department, int setMonthForCountDays){

        this.staffName = name;
        this.staffPosition = position;
        this.staffDepartment = department;
        this.setMonthForCountDays = setMonthForCountDays;
    }

    // TODO: Create a method to call fields.

    public String toString(){

        return "Працівник: " + staffName + ", Посада: " + staffPosition + ", Відділ: " + staffDepartment + ", " ;
    }


    public int getCountOfDays() {
        Calendar cal = Calendar.getInstance();
        int yourMonth = this.setMonthForCountDays;
        cal.set(Calendar.MONTH, yourMonth);
        return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

}
