import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Kalk {

    public static void main(String[] args) {

        String primer = "2 + 3 - 4 * 5 + 10";
        String primer2 = postfixFrom(primer);
        System.out.println(eval(primer2));

    }

    static HashMap<String, Integer> priorituMap = new HashMap<>();
    static HashSet<String> operation = new HashSet<>();

    static {
        priorituMap.put("+", 1);
        priorituMap.put("-", 1);
        priorituMap.put("*", 2);
        priorituMap.put("/", 2);
        priorituMap.put("(", 3);

        operation.add("+");
        operation.add("-");
        operation.add("*");
        operation.add("/");
    }

    public static String postfixFrom(String infixForm) {

        Stack<String> stackOperation = new Stack<>();
        StringBuilder result = new StringBuilder();
        String[] tokens = infixForm.split(" ");
        System.out.println(Arrays.toString(tokens));
        for (String string : tokens) {
            if ("(".equals(string)) {
                stackOperation.push("(");
            } else if (")".equals(string)) {
                String removed = stackOperation.pop();
                while (!removed.equals("(")) {
                    result.append(removed).append(" ");
                    removed = stackOperation.pop();
                }
            } else if (!operation.contains(string)) {
                result.append(string);
                result.append(" ");
            } else {
                while (!stackOperation.isEmpty()
                        && (priorituMap.get(stackOperation.peek()) >= priorituMap.get(string))) {

                    result.append(stackOperation.pop()).append(" ");
                }
                stackOperation.push(string);
            }
        }
        while (!stackOperation.isEmpty()) {
            result.append(stackOperation.pop()).append(" ");
        }
        System.out.println(stackOperation);
        return result.toString().trim();
    }

    public static int eval(String[] tokens) {
        int result = 0;
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }
        Stack<Integer> nums = new Stack<>();
        for (String token : tokens) {
            if (operation.contains(token)) {
                int second = nums.pop();
                int first = nums.pop();
                nums.add(perform(token, first, second));
                result = nums.peek();

            } else {
                nums.add(Integer.parseInt(token));
            }
            return result;
        }

    }

    public static int perform(String token, int first, int second) {

        switch (token) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return first / second;
        }

    }
}
