public class Main {
    public static void main(String[] args){
        Animal lion = new Animal();
        lion.name = "Sakalo";
        lion.age = 6;
        lion.family= "cats";
        lion.isMammal= true;
        System.out.println(lion.name);

        Animal dog = new Animal("canine", "snoopy", 2 , true);

        Zoo myZoo = new Zoo("wildlife city", "Ariana");

        myZoo.displayZoo();

        System.out.println("----------------------------------");
        System.out.println(myZoo.toString());
        System.out.println(dog.toString());

        System.out.println("----------------------------------");
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));
        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        System.out.println(myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println(myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        // Instruction 14 : Utilisation de la constante NBR_CAGES
        System.out.println("Le nombre maximum de cages par zoo est : " + myZoo.NBR_CAGES);

        // Instruction 15 : Vérification si le zoo est plein
        if (myZoo.isZooFull()) {
            System.out.println("Le zoo est plein.");
        } else {
            System.out.println("Le zoo n'est pas plein.");
        }

        // Instruction 16 : Comparer deux zoos
        Zoo otherZoo = new Zoo("Zoo XYZ", "Ville XYZ");
        otherZoo.addAnimal(new Animal("Felidae", "Lion", 5, true));

        Zoo zooAvecPlusAnimaux = Zoo.comparerZoo(myZoo, otherZoo);
        System.out.println("Le zoo avec le plus d'animaux est : " + zooAvecPlusAnimaux.name);
    }
}



