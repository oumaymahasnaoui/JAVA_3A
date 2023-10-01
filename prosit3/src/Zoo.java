public class Zoo {

    Animal [] animals;
    String name;
    String city;
    private final int NBR_CAGES = 25;

    int nbrAnimals;

    public Zoo(){

        animals=new Animal[NBR_CAGES];
    }
    public boolean isZooFull() {
        return nbrAnimals >= NBR_CAGES;
    }
    public Zoo(String name, String city){

        animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;

    }

    public void displayZoo(){
        System.out.println("Name: "+ name + ",");
    }

    boolean addAnimal(Animal animal){
        if (searchAnimal(animal) != -1){
            return false;
        }
        if(nbrAnimals <NBR_CAGES){
            animals[nbrAnimals]= animal;
            nbrAnimals++;
            return true;
        }else return false;
    }

    void displayAnimals(){
        System.out.println("liste des animaux de "+ name + ":");
        for (int i = 0; i< nbrAnimals; i++){
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal){
        int index = -1;
        for (int i =0; i<nbrAnimals; i++){
            if(animal.name == animals[i].name){
                return i;
            }
        }
        return index;
    }

    boolean removeAnimal(Animal animal){
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1){
            return false;
        }
        for (int i = indexAnimal; i< nbrAnimals; i++){
            animals[i] = animals[i+1];
        }
        animals[nbrAnimals]= null;
        nbrAnimals--;
        return true;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z1.nbrAnimals < z2.nbrAnimals) {
            return z2;
        } else {
            // Si les deux zoos ont le même nombre d'animaux, retournez l'un d'entre eux (par exemple, z1)
            return z1;
        }
    }
    @Override
    public String toString() {
        return "Name: " + name + "\n"
                + "City: " + city + "\n"
                + "Nombre de cage: " + NBR_CAGES;
    }
}
