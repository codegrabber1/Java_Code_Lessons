package task15;

public class Animal {

    String animalType;
    String animalName;

    public Animal(String animalType, String animalName){
        this.animalType = animalType;
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + animalType + '\'' +
                ", animalName='" + animalName + '\'' +
                '}';
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getAnimalName() {
        return animalName;
    }
}
