package task19;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main{

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee empl = new Employee("Petro", 1, 1232);

        Methods mt = new Methods();

        mt.serialize(empl);

        mt.deserialize(empl);

        System.out.println("===");

        List<Employee> employeeList = new ArrayList<>();

        Random r = new Random();

        for(int i = 0; i< 10; i++){
            Employee employee = new Employee("Petro"+r.nextInt(5), r.nextInt(8), 100+r.nextInt(10));
            employeeList.add(employee);
        }
        mt.serialize(employeeList);

        mt.deserialize(employeeList);

    }
}