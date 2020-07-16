package task13;

import java.util.*;


import static java.lang.System.exit;

public class Main {

    public static void main(String[] args){

        Scanner menu = new Scanner(System.in);
        String str;
        Rada rada = new Rada();

        boolean state = true;

        while(state){
            showAction();
            System.out.println("Enter num");
            str = menu.next();

            Scanner fmenu = new Scanner(System.in);
            switch(str){
                case "1" : {

                    System.out.println("Enter the fraction name: ");
                    String fName = fmenu.next();

                    System.out.println("Added fraction: ");
                    rada.addFraction(fName);

                    System.out.println("==== BREAK ====");

                 break;
                }
                case "2" : {

                    rada.showAllFraction();
                    System.out.println("Enter fraction's name to remove");

                    String fName = menu.next();
                    rada.removeFraction(fName);


                    System.out.println("Fraction(s) remains: ");
                    rada.showAllFraction();
                    System.out.println("==== BREAK ====");
                    break;
                }
                case "3" : {
                    rada.showAllFraction();
                    System.out.println("==== BREAK ====");
                    System.out.println();
                    break;
                }
                case "4" : {

                    System.out.println("Which fraction to clear");
                    rada.showAllFraction();

                    String frName = menu.next();
                    rada.clearFraction(frName);
                    break;
                }
                case "5" : {

                    System.out.println("Which fraction to show");
                    rada.showAllFraction();

                    String frName = menu.next();
                    rada.showFraction(frName);

                    System.out.println("==== BREAK ====");
                    System.out.println();
                    break;
                }
                case "6" : {


                    System.out.println("Add deputy to the fraction! Choose the fraction");
                    rada.showAllFraction();

                    String frName = menu.next();
                    Random r = new Random();


                    System.out.println("How many deputies to add?");

                    int hd = menu.nextInt();

                    for (int i = 0; i < hd; i++) {

                        Deputy d = new Deputy(100 + r.nextInt(100), 100 + r.nextInt(100),
                                "Deputy" + r.nextInt(10), 40+r.nextInt(30),
                                i % 2 == 0);
                        rada.addDepIntoFraction(frName, d);
                    }

                    System.out.println(" ");
                    System.out.println("There are some deputies who like bribes. Do you want to give some money? Type = yes or no" );

                    String agree = menu.next();

                    if(agree.equals("yes")) {
                        System.out.println("Choose the fraction");
                        rada.showAllFraction();

                        String fName = menu.next();
                        rada.showFraction(fName);

                        System.out.println("There are some deputies who like bribes. Give some money. Chose the person" );

                        String dName = menu.next();
                        System.out.println("Set the sum of money to give" );

                        int countOfBribe = menu.nextInt();
                        rada.giveBribe(fName,dName, countOfBribe );

                        System.out.println(" === BREAK === ");
                    }


                    break;
                }
                case "7" : {
                    System.out.println("Chose the fraction");

                    rada.showAllFraction();

                    String frName = menu.next();

                    rada.showFraction(frName);


                    System.out.println("Chose the person");

                    String dName = menu.next();
                    rada.delDeputyFromFraction(frName, dName);


                    break;
                }
                case "8" : {
                    System.out.println("Choose the fraction to see all bribers");
                    rada.showAllFraction();

                    String frName = menu.next();
                    rada.getAllBribers(frName);

                    break;
                }
                case "9" : {
                    System.out.println("Choose the fraction to find the most bribed person!");
                    rada.showAllFraction();

                    String frName = menu.next();
                    rada.getMostBriber(frName);
                    break;
                }
                case "10": {
                    state = false;
                    System.out.println("Thank you");
                    exit(0);
                }
            }

        }

    }

    private static void showAction(){
        System.out.println("Enter: 1 to create a fraction");
        System.out.println("Enter: 2 to remove the fraction");
        System.out.println("Enter: 3 to show all fractions");
        System.out.println("Enter: 4 to clear the fraction");
        System.out.println("Enter: 5 to show the fraction");
        System.out.println("Enter: 6 to add a deputy");
        System.out.println("Enter: 7 to remove the deputy from the fraction");
        System.out.println("Enter: 8 to show the list of bribers");
        System.out.println("Enter: 9 to show the most briber");
        System.out.println("Enter: 10 to finish");
    }
}
