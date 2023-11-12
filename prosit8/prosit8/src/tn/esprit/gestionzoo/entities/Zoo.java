package tn.esprit.gestionzoo.entities;
import tn.esprit.exception.ZooFullException;
import tn.esprit.exception.InvalidAgeException;
public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    //////  Instruction 14 /////////
    private final int nbrCages = 3;
    private int animalCount;
     //////  Instruction 25 /////////
    private Aquatic[] aquaticAnimals;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
        this.aquaticAnimals = new Aquatic[10];
    }

    //////  Instruction 15 /////////
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }


    //////  Instruction 16 /////////
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.getAnimalCount() > z2.getAnimalCount()) {
            return z1;
        } else if (z2.getAnimalCount() > z1.getAnimalCount()) {
            return z2;
        } else {
            return null;
        }
    }


    //Instruction 32//
    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (isZooFull()){
            throw new ZooFullException();
        }
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return;
            }
        }
            animals[animalCount] = animal;
            animalCount++;
    }
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null && animals[i].equals(animal)) {
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null;
                animalCount--;
                return true;
            }
        }
        return false;
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null) {
                System.out.println("Cage " + (i + 1) + ": " + animals[i]);
            } else {
                System.out.println("Cage " + (i + 1) + ": Vide");
            }
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }



    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                if (aquatic instanceof Aquatic) {
                    aquaticAnimals[i] = aquatic;
                    System.out.println("Animal aquatique ajouté au zoo .");
                    return;
                } else {
                    System.out.println("L'objet n'est pas de type Aquatic et ne peut pas être ajouté au zoo.");
                    return;
                }
            }
        }
        System.out.println("Le zoo est plein.");
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0; 
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
    
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }
    
        System.out.println("Nombre de dauphins dans le zoo : " + dolphinCount);
        System.out.println("Nombre de pingouins dans le zoo : " + penguinCount);
    }
    
    

    public Animal[] getAnimals() {
        return animals;
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas etre vide.");
        }
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "Nom du zoo : " + name + "\nVille du zoo : " + city + "\nNombre de cages : " + nbrCages;
    }


    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }


    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

}
