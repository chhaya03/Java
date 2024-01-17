import java.util.Scanner;

public class Oddnumber {

    public static void main(String[] args) {

        int i, n;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number=");
        n = input.nextInt();

        for (i = 0; i <= n; i++) {

            if (i % 2 == 1) {

                System.out.println(i);

            }

        }

    }
}
