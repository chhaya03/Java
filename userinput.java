import java.util.Scanner;

public class userinput {

  public static void main(String[] args) {

    System.out.println("Taking Input From the User");
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number 1=");
    int a = sc.nextInt();
    System.out.println("Enter number2=");
    int b = sc.nextInt();

    int sum = a + b;
    System.out.println("sum of these numbers");
    System.out.println(sum);
  }

}
