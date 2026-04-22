package animals;

public class Bird extends Animal {
    protected String featherColor;

    public Bird(String name) {}

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, String featherColor) {
        super(name);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println("Bird eats seeds");
    }

    @Override
    public String getVoice() {
        return "Bird sound";
    }

    public String getFeatherColor() { return featherColor; }

    @Override
    public String toString() {
        return super.toString() + ", featherColor=" + featherColor;
    }
}
