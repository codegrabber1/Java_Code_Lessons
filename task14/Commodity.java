package task14;

import java.util.*;

public class Commodity  {

    private String productName;
    private int productWeight;
    private int productLength;
    private int productWidth;


    ArrayList<Commodity> product = new ArrayList<>();

    public Commodity() {
    }

    public Commodity(String productName, int productWeight, int productLength, int productWidth) {
        this.productName = productName;
        this.productWeight = productWeight;
        this.productLength = productLength;
        this.productWidth = productWidth;
    }


    String getProductName() {
        return productName;
    }

    int getProductWeight() {
        return productWeight;
    }

    public int getProductLength() {
        return productLength;
    }

    public int getProductWidth() {
        return productWidth;
    }

    private int getLastSymbol(){
        return this.getProductName().length()-1;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "productName='" + productName + '\'' +
                ", productWeight=" + productWeight +
                ", productLength=" + productLength +
                ", productWidth=" + productWidth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return productWeight == commodity.productWeight &&
                productLength == commodity.productLength &&
                productWidth == commodity.productWidth &&
                Objects.equals(productName, commodity.productName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productName, productWeight, productLength, productWidth);
    }

    public void addItems(Commodity commodity){

        product.add(commodity);
    }

    /**
     * Show all products.
      */
    void showAllItems(){

        for (Commodity commodity : product) {
            System.out.println(commodity);
        }

    }

    void showItem(){

        for (Commodity commodity : product) {
            System.out.println(commodity.getProductName());
        }

    }

    void removeItems(String itemName){
        product.removeIf(c -> c.getProductName().equalsIgnoreCase(itemName));

        System.out.println("You have the next product(s): ");
        for(Commodity c: product) {
            System.out.println(c.getProductName());
        }
    }



    boolean changeItem(String oldItem, Commodity newItem){
        boolean state = false;


        for(int i = 0; i < product.size(); i++) {
            if(product.get(i).getProductName().equalsIgnoreCase(oldItem)){
            product.set(i,newItem);

            state = true;
            }
            }


        for(Commodity c: product){
            System.out.println(c);
        }

        return state;
    }

    public void CompareByName(){

        Collections.sort(product, new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                if(o1.getLastSymbol() > o2.getLastSymbol()) {
                    return -1;
                } else if(o1.getLastSymbol() < o2.getLastSymbol()) {

                    return 1;
                }
                return 0;
            }
        });

        for(Commodity c: product){
            System.out.println(c);
        }
    }
     public void CompareByWidth(){

         Collections.sort(product, new Comparator<Commodity>() {
                @Override
                public int compare(Commodity o1, Commodity o2) {
                    if(o1.getProductWidth() < o2.getProductWidth()) {
                        return -1;
                    } else if(o1.getProductWidth() > o2.getProductWidth()) {

                        return 1;
                    }
                    return 0;
                }
            });


         for(Commodity c: product){
             System.out.println(c);
         }
     }

    public void CompareByWeight(){

        Collections.sort(product, new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                if(o1.getProductWeight() < o2.getProductWeight()) {
                    return -1;
                } else if(o1.getProductWeight() > o2.getProductWeight()) {

                    return 1;
                }
                return 0;
            }
        });
        for(Commodity c: product){
            System.out.println(c);
        }
    }

    public void CompareByLength(){

        Collections.sort(product, new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                if(o1.getProductLength() > o2.getProductLength()) {
                    return -1;
                } else if(o1.getProductLength() < o2.getProductLength()) {

                    return 1;
                }
                return 0;
            }
        });

        for(Commodity c: product){
            System.out.println(c);
        }
    }


    boolean getByIndex(int index){

        boolean state = false;

        for(int i = 0; i < product.size(); i++){
            if(i == index) {
                System.out.println(product.get(i).getProductName());
                state = true;
            }
        }

        return state;
    }


}
