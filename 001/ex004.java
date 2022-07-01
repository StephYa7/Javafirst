public class ex004 {
    public static void main(String[] args) {
        int count = 3;
        moveRing("Start", "Finish", "Buff", count);
    }

    public static void moveRing(String a, String b, String c, int count) {
        if (count == 1) {
            System.out.println(String.format("from %s to %s", a, b));
        } else {
            moveRing(a, c, b, count - 1);
            System.out.println(String.format("from %s to %s", a, b));
            moveRing(c, b, a, count - 1);
        }
    }
}
