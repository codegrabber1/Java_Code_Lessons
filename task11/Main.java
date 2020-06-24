package task11;

import java.util.*;
class Main{
    public static void main(String[] args){

        /*
         * The method generates random digits in settled range.
         */
        int d = getRandomDigits(2, 10);

        /*
         * The array of digits.
         */
        Integer[] randomInt = new Integer[d];

        /*
         * Filling up the array by randomized digits.
         */
        for(int i = 0; i < d; i ++) {

            randomInt[i] = getRandomDigits(2, 10);
        }

        /*
         * Sorting in direct order.
         */
        Arrays.sort(randomInt);

        System.out.println(Arrays.deepToString(randomInt));

        /*
         * Sorting in reverse order.
         */
        Arrays.sort(randomInt, Collections.reverseOrder());

        System.out.println(Arrays.deepToString(randomInt));


        /*
         * Creating user's console menu.
         */
        Scanner userMenu = new Scanner(System.in);
        String str;

        /*
         * Getting random digits.
         */

        Random r = new Random();

        boolean state = true;

        /*
         * Setting the initial range of the array.
         */
        int firstRange = r.nextInt(2);
        int secondRange = r.nextInt(2);

        /*
         * Creating dynamically Array for a car with a random range of digits.
         */
        Car[][] car = new Car[firstRange][secondRange];
        Engine engine = new Engine(6);
        Wheel wheel = new Wheel(20+firstRange, "Plastic");

        while(state){
            showAction();
            str = userMenu.nextLine();
            switch(str){
                case"1": {

                    for(int i = 0; i < car.length; i++){
                        for(int j = 0 ; j < car[i].length; j++){

                            car[i][j] = new Car(200+firstRange%9, 2010+secondRange%9,
                                    engine,wheel);
                        }

                    }
                    System.out.println(Arrays.deepToString(car));

                    break;
                }
                case "2": {

                    Car abstractCar = new Car(300, 2010,
                            new Engine(8), new Wheel(20, "Wood"));

                    for(Car[] x: car){
                        Arrays.fill(x, abstractCar);

                    }

                    System.out.println(Arrays.deepToString(car));
                    break;
                }
                case "3": {
                    state = false;
                    System.out.print("Thank you!");
                    System.exit(0);
                }
            }
        }

    }

    /**
     * The method to generate random digits in settled range.
     * @param min
     * @param max
     * @return two randomized digits.
     */
    public static int getRandomDigits(int min, int max) {
        if(min >= max) {
            throw new IllegalArgumentException("Max must to be bigger than min");
        }

        Random d = new Random();

        return d.nextInt(max-min + 1) + max;
    }

    /**
     * The text for user's console menu.
     */
    public static void showAction(){
        System.out.println("Press 1 to get the list of cars");
        System.out.println("Press 2 to get info about a car");
        System.out.println("Press 3 to exit");
    }

}