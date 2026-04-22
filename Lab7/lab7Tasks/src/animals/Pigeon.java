package animals;

public class Pigeon extends Bird {
    private String species;


    public Pigeon() {
        super("Pigeon");
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name);
        this.species = species;
    }


    @Override
    public void eat() {
        System.out.println("Pigeon eats grains");
    }

    @Override
    public String getVoice() {
        return "Coo coo";
    }

    public void fly() {
        System.out.println("Pigeon is flying");
    }

    @Override
    public String toString() {
        return super.toString() + ", species=" + species;
    }
}