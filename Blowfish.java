public class Blowfish extends Fish implements AnimalBehavior, AnimalMove {
    public Blowfish() {
        super();
    }

    public Blowfish(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void puff() {
        System.out.println("Blowfish is puffing.");
    }

    @Override
    public void eat() {
        System.out.println("Blowfish is eating.");
    }

    @Override
    public String getVoice() {
        return ""; // Blowfish doesn't make a sound
    }

    @Override
    public void sleep() {
        System.out.println("Blowfish is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims.");
    }

    @Override
    public String toString() {
        return "Blowfish [name=" + name + ", age=" + age + ", weight=" + weight + "]";
    }
}