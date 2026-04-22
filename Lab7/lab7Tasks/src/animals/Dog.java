package animals;

public class Dog extends Mammal {
    private boolean dancing;

    public Dog() {
    super("Dog");
    }

    public Dog(String name, int age, double weight, String furColor, boolean dancing) {
        super(name, age, weight, furColor);
        this.dancing = dancing;
    }


    public Dog(String name, boolean dancing) {
        super(name);
        this.dancing = dancing;
    }

    @Override
    public void eat() {
        System.out.println("Dog eats dog food.");
    }

    @Override
    public String getVoice() {
        return "Woof!";
    }


    public void dance() {
        if (dancing) {
            System.out.println("The dog is dancing!");
        } else {
            System.out.println("The dog cannot dance.");
        }
    }

    public boolean isDancing() {
        return dancing;
    }

    public void setDancing(boolean dancing) {
        this.dancing = dancing;
    }

    @Override
    public String toString() {
        return super.toString() + ", dancing=" + dancing;
    }
}