package task23;

public class Deputy{
    private String name;
    private int age;
    private boolean briber;
    private int amountOfBribe;

    public Deputy(String name, int age, boolean briber) {
        this.name = name;
        this.age = age;
        this.briber = briber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
        return "Deputy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", briber=" + briber +
                ", amountOfBribe=" + amountOfBribe +
                '}';
    }

     void giveABribe(int money){
        if(isBriber()){
            if(money > 5000){
                System.out.println("The deputy was arrested.");
                System.exit(0);
            } else{
                this.setAmountOfBribe(money);
                System.out.println();
            }
        } else{
            System.out.println("This deputy is not a briber");
        }
    }
}