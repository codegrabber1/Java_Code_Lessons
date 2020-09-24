package task23.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Predicate;

public class Commodity {
    private String productName;
    private int productWeight;
    private int productLength;
    private int productWidth;

    ArrayList<Commodity> product = new ArrayList<>();

    public Commodity(String productName, int productWeight, int productLength, int productWidth) {
        this.productName = productName;
        this.productWeight = productWeight;
        this.productLength = productLength;
        this.productWidth = productWidth;
    }

    public Commodity() {

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

    public String getProductName() {
        return "The name od product: " + productName;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public int getProductLength() {
        return productLength;
    }

    public int getProductWidth() {
        return productWidth;
    }

    void addItems(Commodity commodity){
        product.add(commodity);
        System.out.println("Item " +commodity.productName+" was added successfully");
    }

    /**
     * Show all products.
     */
    void showAllItems(){
        product.stream().findAny().ifPresent(p -> System.out.println(product.toString()));
    }

    void countOfProduct(){
        int num = product.size();
        if(num-1 > 1 ) {
            System.out.printf("There are %s products", num-1);
        } else {
            System.out.printf("There is %d product! Type %s to get it", num, num-1);
        }
    }

    void removeItem(String item){
        product.removeIf(p->p.getProductName().equalsIgnoreCase(item));

        if(product.isEmpty()){
            System.out.println("Product was deleted successfully! Unfortunately, you don't have any product");
        }else{
            System.out.println("You have such products: ");
            product.forEach(product-> System.out.println(product.productName));
        }
    }

    void changeItem(String oldItem, Commodity newItem){
        Predicate<Commodity> isProduct = p->p.getProductName().equalsIgnoreCase(oldItem);
        Optional<Commodity> showProduct = product.stream().filter(isProduct).findAny();

        showProduct.ifPresent(p->product.set(0,newItem));
        showAllItems();

    }

    void compareByName(){
        product.stream().sorted(Comparator.comparing(Commodity::getProductName).reversed())
            .forEach(p ->System.out.println(p.getProductName()));

    }
    void compareByLength(){
        product.stream().sorted(Comparator.comparingInt(Commodity::getProductLength).reversed())
        .forEach(p-> System.out.println(p.toString()));
    }

    void compareByWidth(){
        product.stream().sorted(Comparator.comparingInt(Commodity::getProductWidth).reversed())
                .forEach(p-> System.out.println(p.toString()));
    }
    void compareByWeidht(){
        product.stream().sorted(Comparator.comparingInt(Commodity::getProductWeight).reversed())
                .forEach(p-> System.out.println(p.toString()));
    }
    void getByIndex(int index){
        product.stream().findFirst().ifPresent(p -> System.out.println(product.get(index)));
    }
}
