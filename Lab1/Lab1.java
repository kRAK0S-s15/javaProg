class Human {
    public String name;
    public String surname;
    public int yearOfBirth; 

    public Human(String name, String surname, int yearOfBirth){
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toSting(){
        return "Human: name: " + name + ", surname: " + surname + ", year of birth: " + yearOfBirth
    }

    public class
}