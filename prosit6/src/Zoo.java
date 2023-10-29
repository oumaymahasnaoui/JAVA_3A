public class Zoo {

    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    int nbr_aqu_anim;
    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
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
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }

    public boolean addAnimal(Animal animal , Zoo z) {

        if (isZooFull(z) || searchAnimal(animal)!=-1){

            return false;

        }
        animals[nbrAnimals]=animal;
        System.out.println("the animal is added sucefuly");
        nbrAnimals++;
        return true;



    }

    public boolean removeAnimal(Annimal annimal){

        if (searchAnnimal(annimal) == -1){
            return false;
        }
        for (int i =searchAnnimal(annimal) ; i< nbrAnimals; i++){
            animals[i] = animals[i+1];
        }
        animals[nbrAnimals]= null;
        nbrAnimals--;
        return true;

    }

    public boolean isZooFull(Zoo z1){
        if(z1.nbrAnimals==z1.NUMBER_OF_CAGES){
            return true;


        }

        int x=z1.NUMBER_OF_CAGES-z1.nbrAnimals;
        return false;




    }
    public Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.nbrAnimals> z2.nbrAnimals){
            return z1;
        }else {
            return z2;
        }


    }

    public void addAquaticAnimal(Aquatic aquatic){
        if (nbr_aqu_anim<10)
        { aquaticAnimals[nbr_aqu_anim]=aquatic;
            nbr_aqu_anim++;
            System.out.println("added succesfuly");

        }
        else
        {
            System.out.println("is full ");
        }



    }
    public float maxPenguinSwimmingDepth(  ){

        float max=0;
        for (int i=0; i<nbr_aqu_anim;i++){
            if(aquaticAnimals[i] instanceof Penguin   ){
                Penguin penguin =(Penguin) aquaticAnimals[i];
                float swimmingDepth = penguin.getSwimmingDepth();
                if(swimmingDepth>max){
                    max=swimmingDepth;
                }
            }

        }

        return max;
    }

    public void displayNumberOfAquaticsByType(){
        int nbrpenguin=0;
        int nbrdoplhin=0;
        for(int i=0 ; i<nbr_aqu_anim;i++){
            if(  nbr_aqu_anim;[i] instanceof Penguin   ){
                nbrpenguin++;
            }
            else
            {
                nbrdoplhin++;
            }


        }
        System.out.println("nombre de penguin: " + nbrdoplhin);
        System.out.println("nombre de penguin: " + nbrpenguin);
    }




}
