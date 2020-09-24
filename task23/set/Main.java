package task23.set;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str;

        Commodity commodity = new Commodity();

        boolean state = true;

        Random r = new Random();
        while(state) {
            showAction();
            System.out.println("Choose a number:");
            str = scanner.next();

            Scanner menu = new Scanner(System.in);
            switch(str){
                case"1": {
                    System.out.println("How many products to add: ");
                    int amount = menu.nextInt();
                    for(int i = 0; i < amount; i++){
                        commodity.addItems(
                                new Commodity("Item"+r.nextInt(10)%9,
                                        50 + r.nextInt(30),
                                        40 + r.nextInt(10),40 + r.nextInt(10)));
                    }
                    break;
                }
                case"2": {
                    System.out.println("Choose a product to delete");
                    commodity.showAllItems();
                    String itemName = menu.next();

                    commodity.removeItem(itemName);
                    break;
                }

                case"3":{
                    System.out.println("Choose the product to change its name");
                    commodity.showAllItems();
                    String oldName = menu.nextLine();
                    System.out.println("Enter data with a space in order to change the product : Name Weight Length Width");
                    String newData = menu.nextLine();
                    String[] newName = newData.split(" ") ;

                    commodity.changeItem(oldName, new Commodity(newName[0],
                            Integer.parseInt(newName[1]), Integer.parseInt(newName[2]),
                            Integer.parseInt(newName[3])));
                    break;
                }
                case"4":{
                    commodity.showAllItems();
                    System.out.println("After");
                    commodity.compareByName();
                    break;
                }
                case"5":{
                    commodity.showAllItems();
                    System.out.println("After");
                    commodity.compareByLength();
                    break;
                }
                case"6": {
                    commodity.showAllItems();
                    System.out.println("After");
                    commodity.compareByWidth();
                    break;
                }
                case"7":{
                    commodity.showAllItems();
                    System.out.println("After");
                    commodity.compareByWeidht();
                    break;
                }
                case"8": {
                    System.out.println("Enter the number of collection to show its name!");
                    commodity.countOfProduct();
                    int Index = menu.nextInt();
                    System.out.println();
                    commodity.getByIndex(Index);
                    System.out.println();
                    break;
                }

                case"9": {
                    state=false;
                    System.out.println("Thanx");
                    System.exit(0);
                }
            }
        }

    }

    private static void showAction(){
        System.out.println("Enter: 1 to add a product");
        System.out.println("Enter: 2 to remove the product");
        System.out.println("Enter: 3 to change the name of product");
        System.out.println("Enter: 4 to sort products on the name");
        System.out.println("Enter: 5 to sort products on the length");
        System.out.println("Enter: 6 to sort products on the width");
        System.out.println("Enter: 7 to sort products on the weight");
        System.out.println("Enter: 8 to show n-elements of the collection");
        System.out.println("Enter: 9 to exit");
    }
}
