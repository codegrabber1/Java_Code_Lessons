package task4.task4_first;

public class Cow extends Pet {

    /**
     * Creating inner and super constructor.
     * @param name
     * @param says
     */
    public Cow(String name, String says){
        super(name,says);
    }

    /**
     * Implement method from abstract class.
     */
    @Override
    public String voice(){
        return this.getName() + this.getSays();
    }
}
