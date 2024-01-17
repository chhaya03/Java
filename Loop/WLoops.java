import java.util.Scanner;

public class WLoops {
    public static void main(String[] args) {

        int i = 100, n;

        System.out.print("Enter your number=");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        while (i <= n) {
            System.out.println(i);

            i++;

        }

    }
}
