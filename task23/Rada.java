package task23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Rada{

    private List<Fraction> fraction = new ArrayList<>();

    void createFraction(String fractionName){
        boolean isCreated = fraction.stream().anyMatch(f->f.getName().equalsIgnoreCase(fractionName));

        if(isCreated) {
            System.out.println("This name is already exists");
        }else{
            fraction.add(new Fraction(fractionName));
            fraction.forEach(f->System.out.println(f.getName()));
        }

    }

    void deleteFraction(String fr){
        Iterator<Fraction> fractionIterator = fraction.iterator();

        while(fractionIterator.hasNext()){
            Fraction fraction = fractionIterator.next();

            if(fraction.getName().equalsIgnoreCase(fr)){
                fractionIterator.remove();
                System.out.println("Fraction was deleted");
            }
        }
    }

    void showAllFraction(){

        if(fraction.isEmpty()){
            System.out.println("There aren't fractions");
        }else{
//            fraction.forEach(f-> System.out.println(f.toString()));
            fraction.forEach(System.out::println);
        }

    }

    void clearFraction(String frName){
        Predicate<Fraction> isFraction = f -> f.getName().equalsIgnoreCase(frName);
        Optional<Fraction> optionalFraction = fraction.stream().filter(isFraction).findFirst();

        try {
            if(optionalFraction.isPresent()){

                optionalFraction.ifPresent(Fraction::deleteDeputies);

            }else{
                System.out.println("The fraction wasn't cleared");
            }
        } catch(NullPointerException e) {
            System.out.println("The fraction is empty");
        }
    }

    void addDeputyToFraction(String fr, Deputy d){
        Predicate<Fraction> isFraction = f -> f.getName().equalsIgnoreCase(fr);
        Optional<Fraction> showFraction = fraction.stream().filter(isFraction).findAny();

        showFraction.ifPresent(f->f.addDeputy(d));
    }

    void showAllDeputiesOfFraction(String fr) {

        Predicate<Fraction> isFraction = f -> f.getName().equalsIgnoreCase(fr);
        Optional<Fraction> showFraction = fraction.stream().filter(isFraction).findAny();

        showFraction.ifPresent(Fraction::listOfDeputy);

    }

    void removeDeputyFromFraction(String frName, String depName) {
        Predicate<Fraction> isFraction = f -> f.getName().equalsIgnoreCase(frName);
        Optional<Fraction> showFraction = fraction.stream().filter(isFraction).findAny();

        if(showFraction.isEmpty()){
            System.out.println("There is no deputy");
        } else{
            showFraction.ifPresent(f->f.removeDeputy(depName));

        }

    }

    void giveBribe(String fr, String dep, int money){
        boolean isFraction = fraction.stream().anyMatch(f->f.getName().equalsIgnoreCase(fr));
        if(isFraction){
            fraction.forEach(f -> f.giveBribeForDeputy(dep, money));
        }else{System.out.println("There is no such fraction");}
    }

    void showAllBribersOfFraction(String frName){
        Predicate<Fraction> isFraction = f -> f.getName().equalsIgnoreCase(frName);
        Optional<Fraction> showFraction = fraction.stream().filter(isFraction).findAny();

        showFraction.ifPresent(Fraction::allBribers);
    }

    void showMostBriberOfFraction(String frName){
        Predicate<Fraction> isFraction = f -> f.getName().equalsIgnoreCase(frName);
        Optional<Fraction> showFraction = fraction.stream().filter(isFraction).findFirst();


        showFraction.ifPresent(Fraction::mostBribered);

    }


}