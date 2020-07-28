package task14;

import java.util.*;
import static java.lang.System.exit;
import static java.lang.System.out;

public class Main{

    public static void main(String[] args){

        Scanner menu = new Scanner(System.in);
        String str;

        Commodity commodity = new Commodity();


        Random r = new Random();
        boolean state = true;

        while(true) {
            showAction();

            out.println("Enter the num: ");

            str = menu.next();
            Scanner innerMenu = new Scanner(System.in);
            switch (str) {
                case "1": {

                    out.println("How many products to add?");
                    int amount = innerMenu.nextInt();

                    for(int i = 0; i < amount; i++){
                        commodity.addItems(new Commodity(
                                "Product" + r.nextInt(10),  50 + r.nextInt(30),40 + r.nextInt(10),40 + r.nextInt(10)) );
                     }
                    commodity.showAllItems();

                    out.println();
                    break;
                }
                case "2": {

                    out.println("Chose a product to delete");

                    commodity.showItem();
                    String productName = innerMenu.next();

                    commodity.removeItems(productName);

                    out.println();
                    break;
                }
                case "3": {

                    out.println("Enter the name to change old one ");
                    commodity.showAllItems();
                    String oldName = innerMenu.nextLine();
                    out.println("Enter data with a space in order to change the product : Name Weight Length Width");
                    String newData = innerMenu.nextLine();
                    String[] newName = newData.split(" ") ;

                    commodity.changeItem(oldName, new Commodity(newName[0],
                            Integer.parseInt(newName[1]), Integer.parseInt(newName[2]),
                            Integer.parseInt(newName[3])));

                    out.println();
                    break;
                }
                case "4": {

                    commodity.CompareByName();
                    out.println("");
                    out.println("After Sorting");
                    out.println("");
                    commodity.CompareByName();
                    out.println();

                    break;
                }
                case "5": {
                    commodity.showAllItems();
                    out.println("");
                    out.println("After Sorting");
                    out.println("");
                    commodity.CompareByLength();
                    out.println();
                    break;
                }
                case "6": {

                    commodity.showAllItems();
                    out.println("");
                    out.println("After Sorting");
                    out.println("");
                    commodity.CompareByWidth();
                    out.println();
                    break;

                }
                case "7": {

                    commodity.showAllItems();
                    out.println("");
                    out.println("After Sorting");
                    out.println("");
                    commodity.CompareByWeight();
                    out.println();
                    break;
                }
                case "8": {
                    commodity.showAllItems();
                    out.println("Enter the number of collection to show its name! Start with 0");

                    int Index = innerMenu.nextInt();
                    commodity.getByIndex(Index);
                    out.println();
                    break;
                }
                case "9": {
                    state = false;
                    out.println("Thank you");
                    exit(0);

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