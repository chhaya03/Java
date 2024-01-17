class Syntax {

    static int logic(int x, int y) {

        int z;

        if (x > y) {

            z = x + y;
        } else {

            z = (x * y) + 5;
        }
        return z;
    }

    public static void main(String[] args) {

        // first logic values
        int a = 2;
        int b = 6;
        int c;

        c = logic(a, b);

        System.out.println(c);

        // second logic values
        int k = 6;
        int l = 3;

        int j;
        j = logic(k, l);
        System.out.println(j);
    }
}