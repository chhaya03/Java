// factorial by recursive methode.

public class Recursion {

    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        else {

            return n * factorial(n - 1);
        }

    }

    public static void main(String[] args) {

        // Recursion fact = new Recursion();

        // int a = fact.factorial(5);
        // System.out.println(a);
        System.out.println("factorial of entered number is=" + factorial(5));
    }
}
