package animals;

public class Blowfish extends Fish {
    private boolean poisonous;

    public Blowfish() {
        super("Blowfish");
    }

    public Blowfish(String name, int age, double weight, String waterType, boolean poisonous) {
        super(name, age, weight, waterType);
        this.poisonous = poisonous;
    }

    public Blowfish(String name, boolean poisonous) {
        super(name);
        this.poisonous = poisonous;
    }

    @Override
    public void eat() {
        System.out.println("Blowfish eats crustaceans");
    }

    @Override
    public String getVoice() {
        return "Blub";
    }

    public void inflate() {
        System.out.println("Blowfish inflates");
    }

    @Override
    public String toString() {
        return super.toString() + ", poisonous=" + poisonous;
    }
}