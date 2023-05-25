public class Bird extends Animal {
    public String featherColor;

    public Bird() {
        super();
        this.featherColor = "";
    }

    public Bird(String name, int age, double weight) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name) {
        super(name, 0, 0.0);
        this.featherColor = "";
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public String getVoice() {
        return "Bird voice";
    }

    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public String toString() {
        return super.toString() + ", Feather Color: " + featherColor;
    }
}
