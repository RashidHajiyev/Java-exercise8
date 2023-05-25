public class Pigeon extends Bird implements AnimalBehavior, AnimalMove {

    public String species;

    public Pigeon() {
        super();
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight);
        this.species = species;
    }

    public void coo() {
        System.out.println("Pigeon is cooing.");
    }

    @Override
    public void eat() {
        System.out.println("Pigeon is eating.");
    }

    @Override
    public String getVoice() {
        return "Coo!";
    }

    @Override
    public void sleep() {
        System.out.println("Pigeon is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Pigeon flies.");
    }

    @Override
    public String toString() {
        return "Pigeon [name=" + name + ", age=" + age + ", weight=" + weight + ", featherColor=" + featherColor + "]";
    }
}