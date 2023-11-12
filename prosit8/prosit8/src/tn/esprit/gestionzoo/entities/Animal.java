package tn.esprit.gestionzoo.entities;
import tn.esprit.exception.InvalidAgeException;
public class Animal {

    private String family;
    private String name;
    private int age;
    private boolean isMammal;
    public Animal(String family,String name,int age,boolean isMammal){
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }
    @Override
    public String toString() {
        return "Famille : " + family + "\nNom : " + name + "\nÂge : " + age + "\nMammifère : " + isMammal;
    }
    public Animal(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0)
            throw new InvalidAgeException("Animal's age cannot be negative.");
        else
            this.age = age;
    }
    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}
