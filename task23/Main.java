package task23;

import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Choose the number");
        Scanner scanner = new Scanner(System.in);
        String str;

        Rada rada = new Rada();
        boolean state = true;

        while(state) {
            Random r = new Random();
            doAction();
            str = scanner.next();

            Scanner menu = new Scanner(System.in);
            switch(str){
                case"1" : {
                    System.out.println("Create a fraction");
                    String frName = menu.next();
                    System.out.println("A list of fractions: ");
                    rada.createFraction(frName);
                    break;
                }
                case"2": {
                    System.out.println("Choose the fraction to remove");
                    rada.showAllFraction();
                    String frName = menu.next();
                    rada.deleteFraction(frName);
                    break;
                }
                case"3":{
                    System.out.println("All fractions: ");
                    rada.showAllFraction();
                    break;
                }
                case"4":{
                    System.out.println("Choose a fraction to clear");
                    rada.showAllFraction();
                    String frName = menu.next();
                    rada.clearFraction(frName);
                    break;
                }
                case"5":{
                    System.out.println("Choose the fraction to see all deputies");
                    rada.showAllFraction();
                    String frName = menu.next();

                    System.out.println("All deputies of fraction: " + frName);
                    rada.showAllDeputiesOfFraction(frName);

                    break;
                }
                case"6": {
                    System.out.println("How many deputies to add?");
                    int n = menu.nextInt();

                    System.out.println("Choose the fraction to add a deputy");
                    rada.showAllFraction();
                    String frName = menu.next();

                    for(int i = 0; i < n; ++i){
                       Deputy deputy = new Deputy("Petro"+r.nextInt(10)%9, 20+r.nextInt(10)%9, i%2==0);
                       rada.addDeputyToFraction(frName,deputy);
                    }

                    System.out.println("Some deputies like money. Do you want to give some? Type: yes or no  ");

                    String answear = menu.next();
                    if(answear.equals("yes")) {
                        System.out.println("Choose a fraction: ");
                        rada.showAllFraction();
                        String fr = menu.next();

                        System.out.println("Choose a deputy: ");
                        rada.showAllDeputiesOfFraction(fr);
                        String dep = menu.next();

                        System.out.println("Give a sum: ");
                        int money = menu.nextInt();
                        rada.giveBribe(fr, dep, money);
                    }else{
                        System.out.println("You made a good choice");
                    }
                    break;
                }
                case"7": {
                    System.out.println("Choose the fraction to remove the deputy");
                    rada.showAllFraction();
                    String frName = menu.next();

                    System.out.println("Choose the deputy to remove");
                    rada.showAllDeputiesOfFraction(frName);
                    String depName = menu.next();

                    rada.removeDeputyFromFraction(frName, depName);

                    break;
                }
                case"8":{
                    System.out.println("Choose a fraction");
                    rada.showAllFraction();
                    String frName = menu.next();

                    rada.showAllBribersOfFraction(frName);

                    break;
                }
                case"9":{
                    System.out.println("Choose a fraction");
                    rada.showAllFraction();
                    String frName = menu.next();

                    rada.showMostBriberOfFraction(frName);
                    break;
                }

                case"10":{
                    state = false;
                    System.out.println("Thanx");
                    System.exit(0);
                }
            }
        }

    }

    private static void doAction(){
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