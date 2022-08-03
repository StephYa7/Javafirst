import java.util.Stack;

public class PracLast {

    static Stack<Integer> in = new Stack<>();
    static Stack<Integer> out = new Stack<>();

    public static void main(String[] args) {

        in.push(1);
        in.push(2);
        in.push(3);
        in.push(4);
        in.push(5);
        in.push(6);
        in.push(7);

        revers();

        System.out.println(popa());

    }

    public static int popa() {
        
        return out.pop();

    }
    public static void revers() {
        if (!in.empty()){
            while (!in.empty())
            out.push(in.pop());

        }
        
    }

}
