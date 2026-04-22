package animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog("Kobe", 3, 20.0, "Brown", true);
        animals[1] = new Pigeon("Skipper", "Rock Pigeon");
        animals[2] = new Blowfish("Blob", true);

        for (Animal a : animals) {
            System.out.println(a);
            a.eat();
            System.out.println(a.getVoice());
        }

        ((Dog) animals[0]).dance();
        ((Pigeon) animals[1]).fly();
        ((Blowfish) animals[2]).inflate();
    }
}