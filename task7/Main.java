package task7;
import static java.lang.System.out;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*
          Retrieving data from user.
         */
        Scanner data = new Scanner(System.in);

        Sy27 sy = new Sy27(1000, "yellow", 6000, 16, 10, 13  );

        out.print("Щоб завести літак, введіть y: ");

        // Initializing a field which holds data from the console about starting the aircraft.
        String in = data.next();

        if(in.equals("y") ) {
            sy.StartingEngines();

            // Initializing a field which holds data from the console about a move of the aircraft.
            String startFlight = data.next();

            if(startFlight.equals("y")) {

                sy.Takeoff();

            }

        } else {
            out.println("Таким чином Ви не заведете літак!\n");

        }
        data.close();
    }
}
