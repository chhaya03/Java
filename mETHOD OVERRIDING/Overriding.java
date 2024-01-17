class A { // parent class

    public int harry() {

        return 4;
    }

    public void meth2() {

        System.out.println("I am method 2 of class A");
    }

}

class B extends A { // child class

    @Override // method override notation

    public void meth2() { // method override

        System.out.println("I am override method 2 of class B");
    }

    public void meth3() {
        System.out.println("I am method 3 of class B");
    }
}

class Overriding {

    public static void main(String[] args) {

        A a = new A();
        a.meth2();

        B b = new B();
        b.meth3();
        b.meth2();

    }
}