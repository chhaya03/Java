class Base {

    Base() { // Constructor 1

        System.out.println("I am constructor.");

    }

    Base(int a) { // Constructor 2

        System.out.println("I am overloaded constructor2=" + a);
    }

    public int x;

    public int getX() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }
}

// child class

class Derived1 extends Base {

    Derived1() { // constructor1 in child class

        super(10); // value for constructor 1 in parent class
        System.out.println("i am second constructor in derived class.");
    }

    Derived1(int a, int b) { // Constructor 2 in child class

        System.out.println("I am overloaded constructor3=" + a);
        System.out.println("I am overloaded constructor3=" + b);

    }

    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Constructor {
    public static void main(String[] args) {

        Base b = new Base(45);

        Derived1 d = new Derived1(5, 6);

    }

}