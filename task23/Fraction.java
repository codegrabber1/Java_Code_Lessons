package task23;

import java.util.*;
import java.util.function.Predicate;

public class Fraction{

    private String name;

    public String getName() {
        return name;
    }

    public Fraction(String name) {this.name = name;}

    private List<Deputy> dep = new ArrayList<>();

    public void addDeputy(Deputy deputy){
        dep.add(deputy);
        System.out.println("The deputy: "+ deputy.getName()+" entered into the fraction ");
    }

    public void deleteDeputies(){
        dep.clear();
        System.out.println("The fraction was successfully cleared");

    }

    void listOfDeputy(){
        if(dep.isEmpty()){
            System.out.println("The Fraction is empty");
        }else{
            dep.forEach(f->System.out.println(f.toString()));
        }

    }

    void removeDeputy(String depName){
        Predicate<Deputy> isDeputy = deputy -> deputy.getName().equalsIgnoreCase(depName);
        Optional<Deputy> delDep = dep.stream().filter(isDeputy).findFirst();

        if(delDep.isEmpty()) {
            System.out.println("There is no deputy");
        } else {
            delDep.ifPresent(deputy -> dep.remove(deputy));
            System.out.println("Chosen deputy was deleted successfully");
        }

    }

    void giveBribeForDeputy(String depName, int money){
        Predicate<Deputy> isDeputy = deputy -> deputy.getName().equalsIgnoreCase(depName);
        Optional<Deputy> giveBribe = dep.stream().filter(isDeputy.and(Deputy::isBriber)).findAny();

        giveBribe.ifPresent(f->f.giveABribe(money));

        System.out.println("The deputy took your money");
    }

    void allBribers(){
        dep.forEach(deputy -> {
            if (deputy.isBriber()){
                System.out.println(deputy.toString());
            }
        });
    }

    void mostBribered(){
        Deputy sorted = dep.stream()

                .max(Comparator.comparing(Deputy::getAmountOfBribe))
                .orElseThrow(NoSuchElementException::new);
        System.out.println(sorted);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "name='" + name + '\'' +
                '}';
    }
}