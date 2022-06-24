public class ex002 {
    public static void main(String[] args) {
        int a = 4;
        int b = 22;
        int c = 3;
        int d = 2;
        System.out.println(ex2(a, b, c, d));


        // System.out.println(e);

    }

    public static String ex2(int a, int b, int c, int d) {

        String res = "";

        while (a < b) {
            if (((b - a * c) % d == 0) && (a * c < b)) {
                a *= c;
                res += "K1 ";
                System.out.println(a);
            } else {
                a += d;
                res += "K2 ";
                System.out.println(a);
            }
        }
        return res;
    }
}
