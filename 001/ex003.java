public class ex003 {
    public static void main(String[] args) {
        int x = 5;

        System.out.println(trinum(x));
        System.out.println(trinumrec(x));
    }

    public static int trinum(int a) {
        int res = 0;
        while (a > 0) {
            res += a;
            a -= 1;
        }
        return res;
    }

    public static int trinumrec (int a){
        if (a==1) return 1;
        else return(a+trinum(a-1));      
    }
}