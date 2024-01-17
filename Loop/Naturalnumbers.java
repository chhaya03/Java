import java.util.Scanner;

public class Naturalnumbers {

    public static void main(String[] args) {

        System.out.print("enter number=");
        int i, n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}
