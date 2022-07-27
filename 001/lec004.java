// import java.util.Stack;
// // import java

// import javax.lang.model.type.ArrayType;

// public class  lec004 {
//     public static void main(String[] args) {

//         var exp = "1 2 3 * +".split(" ");
//         int res = 0;
//         System.out.println(exp);

//         Stack<Integer> st = new Stack<>();
//         for (int i = 0; i < exp.length; i++) {
//             if (isDigit(exp[i])) {
//                 st.push(Integer.parseInt(exp[i]));
//             } else {
//                 switch (exp[i]) {
//                     case "+":
//                         res = st.pop() + st.pop();
//                         st.push(res);
//                         break;
//                 }
//             }

//         }
//     }

// }
