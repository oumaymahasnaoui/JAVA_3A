package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int NBR_CAGES = 25;

    private int nbrAnimals;

    public Zoo() {
        animals = new Animal[NBR_CAGES];
    }

    public Zoo(String name, String city) {
        animals = new Animal[NBR_CAGES];
        setName(name);
        setCity(city);
    }

    public boolean isZooFull() {
        return nbrAnimals >= NBR_CAGES;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull() || searchAnimal(animal) != -1) {
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName().equals(animals[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1) {
            return false;
        }
        for (int i = indexAnimal; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"
                + "City: " + city + "\n"
                + "Nombre de cage: " + NBR_CAGES;
    }
}