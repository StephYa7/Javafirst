import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Spisok {

    static HashMap<Integer, ArrayList<String>> pp = new HashMap<>();

    public static void main(String[] args) {
        pp.put(202365678, new ArrayList<String>(Arrays.asList("ALISSON", "BECKER", "02/10/1992")));
        pp.put(325334435, new ArrayList<String>(Arrays.asList("IBRAHIMA", "KONATE", "25/05/1999")));
        pp.put(353324332, new ArrayList<String>(Arrays.asList("JOE", "GOMEZ", "23/05/1997")));
        pp.put(326326234, new ArrayList<String>(Arrays.asList("KOSTAS", "TSIMIKAS", "12/05/1996")));
        pp.put(663566532, new ArrayList<String>(Arrays.asList("CALVIN", "RAMSAY", "31/07/2003")));
        pp.put(202323338, new ArrayList<String>(Arrays.asList("NABY", "KEITA", "10/02/1995")));
        pp.put(202363478, new ArrayList<String>(Arrays.asList("CURTIS", "JONES", "30/01/2011")));
        pp.put(205334444, new ArrayList<String>(Arrays.asList("LUIS", "DIAZ", "13/01/1997")));
        pp.put(236343455, new ArrayList<String>(Arrays.asList("DARWIN", "NUNEZ", "24/06/1987")));
        System.out.println(older(22));

    }

    public static String older(int age) {
        LocalDate today = LocalDate.now();
        String gg = new String();
        for (Integer item : pp.keySet()) {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
            LocalDate buf = LocalDate.parse(pp.get(item).get(2), format);
            LocalDate resultDate = compare(today, buf);
            int age2 = resultDate.getYear();
            if (age2 < age) {
                gg += pp.get(item) + "\n";
            }
        }
        return gg;

    }

    static LocalDate compare(LocalDate dateOfSession, LocalDate compared) {
        long resultDays = ChronoUnit.DAYS.between(compared, dateOfSession);
        return LocalDate.of(0, 1, 1).plusDays(resultDays - 1);
    }

}
