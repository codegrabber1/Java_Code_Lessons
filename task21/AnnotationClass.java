package task21;

import java.io.Serializable;

public class AnnotationClass implements Serializable{

    private static final long serialVersionUID = 1L;

    @TestAnnotation(Developer="Java Core", Expirydate="01-10-2020")
    private String personName;

    @Deprecated
    private int age;
    @Deprecated
    private double yourWage;

    public AnnotationClass(String personName, int age, double yourWage) {
        this.personName = personName;
        this.age = age;
        this.yourWage = yourWage;
    }
    /**
     * @return the personName
     */
    public String getPersonName() {
        return personName;
    }
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * @return the yourWage
     */
    public double getYourWage() {
        return yourWage;
    }
    /**
     * @param personName the personName to set
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * @param yourWage the yourWage to set
     */
    public void setYourWage(double yourWage) {
        this.yourWage = yourWage;
    }
    @Override
    public String toString() {
        return "AnnotationClass [personName=" + personName + ", age=" + age + ", yourWage=" + yourWage + "]";
    }



}