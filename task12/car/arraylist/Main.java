package task12.car.arraylist;

import java.util.*;

public class Main {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Random r = new Random();

        /*
         * Creating user's console menu.
         */
        Scanner userMenu = new Scanner(System.in);
        String str;



        ArrayList<Car> auto = new ArrayList<Car>();

        boolean state = true;

        while(state) {
            showAction();
            str = userMenu.nextLine();

            switch(str){
                case "1" : {
                    for(int i = 0; i < r.nextInt(5); i++) {
                        Engine engine = new Engine(r.nextInt(8));
                        Wheel wheel = new Wheel(r.nextInt(8), "Plastic");
                        auto.add(new Car(300+r.nextInt(10),1980+r.nextInt(10),engine, wheel));
                    }


                    System.out.println(auto);
                    break;
                }
                case "2": {

                    Car abstractAuto = new Car(300+r.nextInt(10),1980+r.nextInt(10), new Engine(8), new Wheel(20, "Wood"));

                    auto.add(abstractAuto);

                    System.out.println(auto);
                    break;
                }
                case "3" : {
                    state = false;
                    System.out.print("Thank you!");
                    System.exit(0);
                }
            }
        }


    }


    /**
     * The text for user's console menu.
     */
    public static void showAction() {
        System.out.println("Press 1 to get the list of cars");
        System.out.println("Press 2 to get info about a car");
        System.out.println("Press 3 to exit");
    }

}
