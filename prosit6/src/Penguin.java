public class Penguin  extends Aquatic {

    private float swimmingDepth;

    public Penguin() {
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public void swim(){
        System.out.println("This Penguin animal is swimming");

    }

    public String toString() {
        return super.toString() + ", swimmingDepth:" + swimmingDepth;
    }
}
