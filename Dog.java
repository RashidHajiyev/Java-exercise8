public class Dog extends Mammal implements AnimalBehavior, AnimalMove {
    public Dog() {
        super();
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void bark() {
        System.out.println("Dog is barking.");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public String getVoice() {
        return "Woof!";
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Dog runs.");
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
    }
}
