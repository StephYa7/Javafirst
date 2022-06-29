
public class test {
    public static void main(String[] args) {
        String start = "2? + ?5 = 9?";

        String[] strmed = start.split(" ");
        StringBuilder q = new StringBuilder(strmed[0]);
        StringBuilder w = new StringBuilder(strmed[2]);
        StringBuilder e = new StringBuilder(strmed[4]);

        int indexq = q.indexOf("?");
        int indexw = w.indexOf("?");
        int indexe = e.indexOf("?");
        char quest = (char) 48;

        if (indexq >0){
        q.setCharAt(indexq, quest);}
        if (indexw>0){
        w.setCharAt(indexw, quest);}
        if (indexw>0){
        e.setCharAt(indexe, quest);}

        // if (indexq>0){
            
        for (int i = 48; i < 58; i++) {
            char buff = (char) (i);
            q.setCharAt(indexq, buff);

            for (int s = 48; s < 58; s++) {
                char buff2 = (char) (s);
                w.setCharAt(indexw, buff2);

                for (int a = 48; a < 58; a++) {
                    char buff3 = (char) (a);
                    e.setCharAt(indexe, buff3);

                    int f1 = Integer.parseInt(q.toString());
                    int f2 = Integer.parseInt(w.toString());
                    int f3 = Integer.parseInt(e.toString());

                    if (f1 + f2 == f3) {
                        System.out.println(f1 + "+" + f2 + "=" + f3);
                    }
                }
            }
        }
    }
}
