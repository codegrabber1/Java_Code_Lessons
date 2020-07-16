package task13;

abstract class Human {
    private int weight;
    private int height;


    public Human(int weight, int height){
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }


}
