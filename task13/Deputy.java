package task13;

public class Deputy extends Human  {

    private String name;
    private int age;
    private boolean briber;
    private int amountOfBribe;

    public Deputy(int weight, int height, String name, int age, boolean briber) {
        super(weight, height);
        this.name = name;
        this.age = age;
        this.briber = briber;
    }


    public String getName() {
        return name;
    }

    public boolean isBriber() {
        return briber;
    }

    public int getAmountOfBribe() {
        return amountOfBribe;
    }

    public void setAmountOfBribe(int amountOfBribe) {
        this.amountOfBribe = amountOfBribe;
    }

    @Override
    public String toString() {
        return  name +
                ", weight='" + super.getWeight()+ '\'' +
                "height='" + super.getHeight()+ '\'' +
                 "age=" + age +
                ", briber=" + briber + ", amount the bribe=" + getAmountOfBribe();
    }

    /**
     * The method let you give a bribe to a politician.
     * @param bribe boolean.
     */

    public void addBribe(int bribe){
        if(this.briber){
            if(bribe < 5000) {
                setAmountOfBribe(bribe);
                System.out.println("The bribe has successfully taken ");
                System.out.println();
            } else {
                setAmountOfBribe(bribe);
                System.out.println("The police arrested the deputy");
                System.out.println();
            }
        }else{
            System.out.println("This person Not a briber");
        }

    }


}
