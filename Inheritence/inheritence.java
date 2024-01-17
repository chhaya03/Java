class Base { // parent class

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {

        System.out.println("I am in base and setting x now");

        this.x = x;
    }

    public void printMe() {

        System.out.println("I am a constructor");

    }

}

class Derived extends Base { // Derived class
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {

        this.y = y;
    }
}

class inheritence {

    public static void main(String[] args) {

        Derived d = new Derived();

        d.setX(10);
        System.out.println(d.getX()); // derived x througth derived method from parent class

        d.setY(10);
        System.out.println(d.getY()); // derived x througth derived method
    }
}