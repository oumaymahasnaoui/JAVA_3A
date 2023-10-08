package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);

        Zoo myZoo = new Zoo("Wildlife City", "Ariana");

        myZoo.displayAnimals();

        System.out.println("----------------------------------");
        System.out.println(myZoo.toString());
        System.out.println(lion.toString());

        System.out.println("----------------------------------");
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(tiger));
        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(tiger));
System.out.println(myZoo.removeAnimal(lion));
        myZoo.displayAnimals();

        System.out.println(myZoo.removeAnimal(lion));
        myZoo.displayAnimals();

        // Instruction 17 : Utilisation de isZooFull()
        System.out.println("----------------------------------");
        Animal anotherLion = new Animal("Felidae", "Another Lion", 6, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);

        System.out.println(myZoo.addAnimal(anotherLion)); // Devrait retourner true
        System.out.println(myZoo.addAnimal(elephant)); // Devrait retourner false car le zoo est plein
        myZoo.displayAnimals();

        // Instruction 18 : Vérification de l'âge négatif et du nom vide
        Animal invalidAnimal = new Animal("Invalid Family", "", -1, false);
        System.out.println(myZoo.addAnimal(invalidAnimal)); // Devrait retourner false
        invalidAnimal.setName("Valid Name");
        invalidAnimal.setAge(2);
        System.out.println(myZoo.addAnimal(invalidAnimal)); // Devrait retourner true
        myZoo.displayAnimals();

        // Instruction 19 : Utilisation des packages tn.esprit.gestionzoo.main et tn.esprit.gestionzoo.entities
        System.out.println("----------------------------------");
        System.out.println("Utilisation des packages :");
        System.out.println("Animal class from entities package: " + new Animal("Family", "Name", 3, true));
        System.out.println("Zoo class from entities package: " + new Zoo("Zoo Name", "Zoo City"));

        // Comparer deux zoos
        Zoo otherZoo = new Zoo("Zoo XYZ", "Ville XYZ");
        otherZoo.addAnimal(new Animal("Felidae", "Lion", 5, true));

        Zoo zooAvecPlusAnimaux = Zoo.comparerZoo(myZoo, otherZoo);
        System.out.println("Le zoo avec le plus d'animaux est : " + zooAvecPlusAnimaux.getName());
        }
        }