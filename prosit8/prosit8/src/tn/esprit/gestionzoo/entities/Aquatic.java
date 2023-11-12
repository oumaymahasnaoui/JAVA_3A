package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal implements Carnivore<Food> {

    protected String habitat;

    public Aquatic() {
    }
    //////  Instruction 24 /////////
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

  //////  Instruction 28 /////////
   // public abstract void swim();

 //////  Instruction 31 /////////
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; 
        }
        Aquatic other = (Aquatic) obj; 
        return this.getName().equals(other.getName()) && this.getAge() == other.getAge() && habitat.equals(other.habitat);
    }
    @Override
    public String toString() {
        return super.toString() + "\nhabitat:" + habitat;
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Aquatic animal eating meat");
        } else {
            System.out.println("Aquatic animal cannot eat this");
        }
    }
}