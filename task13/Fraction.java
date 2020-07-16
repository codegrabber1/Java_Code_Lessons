package task13;

import java.util.*;

public class Fraction{

    private String fName;

    /**
     * The list of deputies.
     */
    ArrayList<Deputy> deputies = new ArrayList<>();

    public Fraction(String fName) {
        this.fName = fName;
    }


    public String getfName() {
        return fName;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "fName='" + fName + '\''+
                '}';
    }

    /**
     * Adding politician into the list.
     * @param deputy- the list of politicians.
     */

    public void addDeputy(Deputy deputy){
        deputies.add(deputy);
    }

    /**
     * Showing all politicians.
     */
    public void allDeputy(){

        if(deputies.isEmpty()){
            System.out.println("The fraction is empty!");
        }else {
            for(Deputy d: deputies){
                System.out.println(d.toString());
            }
        }

    }

    public boolean checkListDep(){

        boolean state = false;

        if(deputies.size() != 0) {
            state = true;
        }

        return state;
    }

    /**
     * Removing a particular politician by his name.
     * @param name = the name of th politician.
     * @return boolean.
     */
    public boolean removeDeputy(String name){

        Iterator<Deputy> d = deputies.iterator();

        boolean state = false;

        while(d.hasNext()){
            Deputy dName = d.next();

            if(dName.getName().equalsIgnoreCase(name)){
                d.remove();

                System.out.println("Chosen deputy was deleted!");
                state = true;
            }

        }

        return state;

    }

    /**
     * Clearing the list of deputies.
     */

    public void removeAll(){

        deputies.clear();
    }

    /**
     * Getting the politician by his name to give a bribe.
     * @param dName = the name of a politician.
     * @param bribe = an amount of bribe.
     * @see {Rada giveBribe}
     */
    public void getDepToGiveBribe(String dName, int bribe){
        Iterator<Deputy> deputyIterator = deputies.iterator();

        while(deputyIterator.hasNext()){

            Deputy d = deputyIterator.next();
            if(d.getName().equalsIgnoreCase(dName)) {
                d.addBribe(bribe);
            }
        }
    }

    /**
     * Showing all deputies who takes bribe.
     * @see {Rada getAllBribers}
     */

    public void allBribers(){

        for(Deputy d: deputies){
            if(d.isBriber()){
                System.out.println(d.toString());
            }
        }
    }


    /**
     * The method compares politicians in a particular fraction and shows the one who's bribe the most.
     * @see {Rada getMostBriber}
     */
    public void mostBribered(){
        Collections.sort(deputies, new Comparator<Deputy>() {
            @Override
            public int compare(Deputy o1, Deputy o2) {
                if (o1.getAmountOfBribe() < o2.getAmountOfBribe()) {
                    System.out.println("The most bribed person is " + deputies.get(0).getName());
                    return 1;
                } else if (o1.getAmountOfBribe() > o2.getAmountOfBribe()){
                    return -1;
                } else{
                    return 0;
                }
            }
        });
    }
}
