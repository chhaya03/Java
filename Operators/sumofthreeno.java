import java.util.Scanner;

class sumofthreeno {

    public static void main(String[] args) {
        System.out.println("Sum of Three numbers");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Three numbers");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int sum = a + b + c;
        System.out.print("sum is =");
        System.out.println(sum);
    }
}