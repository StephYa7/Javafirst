public class ex001 {
    public static void main(String[] args) {
        double a = 2;
        int b = -4;

        System.out.println(powRecursion(a, b));
        System.out.println(powIter(a, b));
    }

    public static double powRecursion(double a, int b) {

        if (b == 0 && a == 0)
            return 0.000;

        if (b == 0)
            return 1;

        if (b < 0)
            return powRecursion(1 / a, -b);

        double res = powRecursion(a, b / 2);

        return b % 2 == 0 ? res * res : res * res * a;
    }
    public static double powIter(double a, int b) {
        double res = 1;
        if (a == 0 && b == 0)
            return 0;
        if (b == 0)
            return 1;
        if (b < 0) {
            b = -b;
            a = (1 / a);
        }

        while (b > 0) {
            if (b % 2 == 1) {
                res = res * a;
            }
            a = a * a;
            b = b / 2;

            // System.out.println(res);
        }
        return res;
    }
}



