import java.util.HashMap;
import java.util.Map;

public class lec005 {
    public static void xmain(String[] args) {

        Integer a = 123;
        System.out.println(a.hashCode());
        System.out.println(" ".hashCode());
    }

    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(null,"!null");
        System.out.println(db);
        System.out.println(db.get(44));
        // db.remove(null);
        System.out.println(db);
        System.out.println(db.containsValue("один"));
        System.out.println(db.keySet());

    }

}
