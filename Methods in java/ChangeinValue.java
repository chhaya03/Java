public class ChangeinValue {

    // method-1

    static void change1(int a) {

        a = 50;

    }

    // mathod-2

    static void change2(int[] arr) {

        arr[0] = 10;
    }

    public static void main(String[] args) {

        // change in integer value

        int x = 20;

        change1(x);

        System.out.println("value of x after change is:" + x);

        // change in array

        int[] marks = { 20, 30, 50, 50 };

        change2(marks);

        System.out.println("value of a marks after changin:" + marks[0]);

    }

}
