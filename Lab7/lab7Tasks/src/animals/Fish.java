package animals;

public class Fish extends Animal {
    protected String waterType;

    public Fish(String name) {}

    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name, String waterType) {
        super(name);
        this.waterType = waterType;
    }

    @Override
    public void eat() {
        System.out.println("Fish eats algae");
    }

    @Override
    public String getVoice() {
        return "Silent";
    }

    @Override
    public String toString() {
        return super.toString() + ", waterType=" + waterType;
    }
}