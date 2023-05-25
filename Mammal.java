public abstract class Mammal extends Animal {
    public Mammal() {
        super();
    }

    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public abstract void eat();

    @Override
    public abstract String getVoice();
}