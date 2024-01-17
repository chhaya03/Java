public class VariableArgument {

    static int sum(int x, int... arr) {

        int result = x;

        for (int element : arr) {

            result += element;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to variable arguement!");
        System.out.println("the sum of 4 and 10 is: " + sum(5));
        System.out.println("the sum of 4 and 10 is: " + sum(4, 10, 50));
        System.out.println("the sum of 4 and 10 is: " + sum(4, 10, 30, 60));
        System.out.println("the sum of 4 and 10 is: " + sum(4, 10, 500, 60, 40));
    }

}
