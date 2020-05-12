package task4.task4_first;

public abstract class Pet {

    private String name;
    private String says;

    /**
     * Creating main construct for all classes.
     * @param n
     * @param s
     */
    public Pet( String n, String s) {
        this.name = n;
        this.says = s;
    }

    public String getSays() {
        return says;
    }

    public String getName(){
        return name;

    }

    /**
     * Initialize abstract method for next classes.
     */
    public abstract String voice();
}
