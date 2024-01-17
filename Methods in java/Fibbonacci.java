public class Fibbonacci {

    static int fibo(int n) {

        if (n == 0 || n == 1 || n == 2) {

            return 1;
        }

        else {

            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {

        int x = 6;

        System.out.println("fibbonacci series of entered number=" + fibo(x));

    }
}
