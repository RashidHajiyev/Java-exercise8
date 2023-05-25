public abstract class Fish extends Animal {
    public Fish() {
        super();
    }

    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public abstract void eat();

    @Override
    public abstract String getVoice();
}
