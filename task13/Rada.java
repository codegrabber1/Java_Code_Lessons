package task13;

import java.util.*;

public class Rada {

    /**
     * The list of fractions.
     */

    ArrayList<Fraction> f = new ArrayList<>();

    /**
     * The method adds a new fraction.
     * @param fName
     */
    public void addFraction(String fName){

        f.add(new Fraction(fName));

        for(Fraction fraction: f ) {
            System.out.println(fraction.getfName());
        }
    }

    /**
     * The method shows all fractions.
     */
    public void showAllFraction(){
        if(f.isEmpty()){

            System.out.println("There aren't any elements yet!");
            System.out.println("====BREAK====");

        } else {
            System.out.println("Already registered the next fraction(s): ");
            for (Fraction aF : f) {
                System.out.println(aF.getfName());
            }
        }


    }

    /**
     * The method deletes all politicians from a particular fraction.
     * @param fName
     * @return
     */
    public boolean clearFraction(String fName){

        Iterator<Fraction> fractionIterator = f.iterator();

        boolean state = false;

        while(fractionIterator.hasNext()){
            Fraction fr = fractionIterator.next();

            if(fr.getfName().equalsIgnoreCase(fName)){
                System.out.println("The fraction was cleared from politicians");

                fr.removeAll();
                state = true;

            }
        }

        return state;

    }

    public boolean checkList(String frName){
        Iterator<Fraction> fr = f.iterator();

        boolean state = false;

        while(fr.hasNext()){
            Fraction fraction = fr.next();

            if(frName.equalsIgnoreCase(fraction.getfName())){
                fraction.checkListDep();

                state = true;
            }
        }

        return state;
    }

    /**
     * The method deletes a particular fraction.
     * @param fName
     */
    public void removeFraction(String fName){

        Iterator<Fraction> fractionIterator = f.iterator();

        while(fractionIterator.hasNext()){
            String fNa = fractionIterator.next().getfName();
            if(fNa.equalsIgnoreCase(fName)){
                fractionIterator.remove();
            }

        }

    }

    /**
     * The methods adds a deputy into a fraction.
     * @param fName - the name of the fraction.
     * @param deputy - the object of deputies.
     * @return boolean
     */
    public boolean addDepIntoFraction(String fName, Deputy deputy){
        Iterator<Fraction> fractionIterator = f.iterator();
        boolean state = false;

        if(!f.isEmpty()){
            while(fractionIterator.hasNext()) {
                Fraction f = fractionIterator.next();
                if(f.getfName().equalsIgnoreCase(fName)){
                    f.addDeputy(deputy);
                    state = true;

                }
            }
        }  else {
            System.out.println("Create a fraction before adding a deputy!");
        }

        System.out.println("Deputy "+ deputy + " added into the fraction " + fName);

        return state;

    }

    /**
     * The methods shows a fraction and each deputies in it.
     * @param fName - the name of the fraction.
     * @return boolean
     */

    public boolean showFraction(String fName){
        ListIterator<Fraction> fractionIterator = f.listIterator();

        boolean state = false;

        if(!f.isEmpty()) {
            while(fractionIterator.hasNext()) {
                Fraction fr = fractionIterator.next();
                if(fr.getfName().equalsIgnoreCase(fName)) {
                    fr.allDeputy();
                    state = true;

                }
            }
        } else {
            System.out.println("There isn't any element yet!");
        }

        return state;

    }

    /**
     * The methods deletes a particular deputy from the fraction.
     * @param fRName - the name of the fraction.
     * @param name - the name of a politician.
     * @return boolean.
     */

    public boolean delDeputyFromFraction(String fRName, String name){

        Iterator<Fraction> fractionIterator = f.iterator();

        boolean state = false;
        if(f.isEmpty()){
            System.out.println("There isn't any fraction(s)!");
            return false;
        } else{
            while (fractionIterator.hasNext()) {
                Fraction f = fractionIterator.next();
                if(!f.deputies.isEmpty()){
                    if(f.getfName().equalsIgnoreCase(fRName)){
                        f.removeDeputy(name);
                        state = true;
                    }
                }else {
                    System.out.println("There aren't any politician here");
                }

            }
        }

        return  state;
    }

    /**
     * The methods execute the action of giving a bribe.
     * @param fRName - the name of the fraction.
     * @param dName - the name of the politician who takes a bribe.
     * @param sum of bribe.
     * @return boolean.
     */

    public boolean giveBribe(String fRName, String dName, int sum){
        Iterator<Fraction> fractionIterator = f.iterator();
        boolean state = false;

        while(fractionIterator.hasNext()){
            Fraction fr = fractionIterator.next();
            if(fr.getfName().equalsIgnoreCase(fRName)){
                fr.getDepToGiveBribe(dName, sum);
                state = true;
            }
        }

        return state;
    }

    /**
     * The methods shows all bribers in a particular fraction.
     * @param fRName - the name of the fraction.
     */

    public void getAllBribers(String fRName){
        Iterator<Fraction> fractionIterator = f.iterator();

        if(f.isEmpty()){
            System.out.println("There isn't any fraction!");
        }else{
            while(fractionIterator.hasNext()){
                Fraction fr = fractionIterator.next();
                if(fr.getfName().equalsIgnoreCase(fRName)){
                    fr.allBribers();
                }
            }
        }



    }

    /**
     * The methods shows the most briber politician  in a particular fraction.
     * @param frName - the name of the fraction.
     */
    public void getMostBriber(String frName){
        Iterator<Fraction> bribeIterator = f.iterator();
        if(f.isEmpty()){
            System.out.println("There isn't any fraction!");
        }else{

            while(bribeIterator.hasNext()){
                Fraction fr = bribeIterator.next();
                if(fr.getfName().equalsIgnoreCase(frName)){
                    fr.mostBribered();
                }

            }
        }
    }
}
