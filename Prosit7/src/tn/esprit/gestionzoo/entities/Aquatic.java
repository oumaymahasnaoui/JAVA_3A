package tn.esprit.gestionzoo.entities;

public non-sealed class Aquatic extends Animal {

    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override



    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }
    //public abstract void swim();


    @Override

    public boolean equals(Object o) {
        if (this == o)
        {return true;}
        if (o == null || getClass() != o.getClass())
        {return false;}
        if (!super.equals(o))
        {return false;}
        Aquatic aquatic = (Aquatic) o;
        return Objects.equals(getName(), aquatic.getName()) &&
                Objects.equals(getAge(),aquatic.getAge()) &&
                Objects.equals(habitat, aquatic.habitat);
    }

    public int hashCode() {
        return Objects.hash(habitat);
    }

}
