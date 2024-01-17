public class PrecdendenceAssociativity {

    public static void main(String[] args) {

        // Precendence & Associativity

        int a = 6 * 5 - 34 / 2;
        System.out.println(a);
        /*
         * Highest precedence goes to * and /. They are then evaluated on the basis of
         * left to right associativity.
         * =30-34/2
         * =30-17
         * =13
         */

        int b = 60 / 5 - 34 * 2;

        /*
         * =12-34*2
         * =12-68
         * =-56
         */

        System.out.println(b);

        // quick Quiz

        int x = 6;
        int y = 2;

        int c = x * y / 2;
        System.out.println(c);

    }

}
