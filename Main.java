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
    }
}
