public class Overloading {

    static void foo() {                                             // parameters

        System.out.println("Good morning bro!");

    }

    static void foo(int a) {                                        // parameters
        System.out.println("Good morning " + a + "  bro!");
    }

    public static void main(String[] args) {
        // Method overloading

        foo();                                           //Arguments which is actual
        foo(200);
    }

}
