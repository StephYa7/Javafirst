// 12 Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

// public class ex012 {
//     public static void main(String[] args) {
//         String Start = "{a+]}{(d*3)}";
//         Check(Start);

//     }
//     public static void Check(String start) {
//         String open ="({[";
//         String close = ")}]";
//         StringBuilder buff = new StringBuilder();   
//         for (int i = 0; i < start.length(); i++){
//             // System.out.println(start.charAt(i));

//             for (int j = 0;j < open.length(); j++){
//                 if (start.charAt(i) == open.charAt(j)){
//                     buff.append(start.charAt(i));
//                 }
//             }
//             for (int j = 0;j < close.length(); j++){
//                 if (start.charAt(i) == close.charAt(j)){
//                     for (int q = 0;j < buff.length(); q++){
                    
//                 }

//             }
//         }}
//     System.out.println(buff);
//     }
    
// }
