// 12 Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

public class test {
    public static void main(String[] args) {
        String Start = "{a+]}{(d*3)}";
        Check(Start);
    }
    public static void Check(String start) {
    int countfirst = 0;
    int countsecond = 0;
    int counthird = 0;
    int countfourth = 0;

        for (int i = 0; i < start.length(); i++){
            if (start.charAt(i)== '(') countfirst++;
            if (start.charAt(i)== ')') countfirst--;
            if (countfirst<0){ System.out.println("false");
                System.exit(1); ;}
            if (start.charAt(i)== '{') countsecond++;
            if (start.charAt(i)== '}') countsecond--;
            if (countsecond<0){ System.out.println("false");
                System.exit(1) ;}
            if (start.charAt(i)== '[') counthird++;
            if (start.charAt(i)== ']') counthird--;
            if (counthird<0){ System.out.println("false");
                System.exit(1) ;}
            if (start.charAt(i)== '<') countfourth++;
            if (start.charAt(i)== '>') countfourth--;
            if (counthird<0){ System.out.println("false");
                System.exit(1) ;}

        }
    if (countfirst!=0 || countsecond!=0 || counthird!=0 || countfourth !=0 ) System.out.println("false");
    else System.out.println("true");
    }
}
