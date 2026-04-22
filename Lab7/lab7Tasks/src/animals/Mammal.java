package animals;

public class Mammal extends Animal {
    protected String furColor;

    public Mammal() {}

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    @Override
    public void eat() {
        System.out.println("Mammal eats");
    }

    @Override
    public String getVoice() {
        return "Mammal sound";
    }

    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }

    @Override
    public String toString() {
        return super.toString() + ", furColor=" + furColor;
    }
}