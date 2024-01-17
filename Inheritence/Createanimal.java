
class Animal {

    String animal;

    public String getPet() {

        return animal;

    }

    public void setPet(String animal) {
        this.animal = animal;

    }

    // public void haveAnimal() {

    // System.out.println("I have animals");

    // }
}

class Derived extends Animal {

    String dogs;

    public String getDog() {

        return dogs;

    }

    public void setDog(String animal) {
        this.animal = dogs;

    }

}

public class Createanimal {

    public static void main(String[] args) {

        Derived d = new Derived();

        d.setPet("bark");

        System.out.println("dogs " + d.getPet());
    }
}
