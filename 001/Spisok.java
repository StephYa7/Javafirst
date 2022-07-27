import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class Spisok {

    static HashMap<Integer, ArrayList<String>> pp = new HashMap<>();    


    public static void main(String[] args) {
        pp.put(202365678, new ArrayList<String>(Arrays.asList("ALISSON","BECKER","2/10/92")) );
        pp.put(325334435, new ArrayList<String>(Arrays.asList("IBRAHIMA","KONATE","25/5/99")) );
        pp.put(353324332, new ArrayList<String>(Arrays.asList("JOE","GOMEZ","23/5/97")) );
        pp.put(326326234, new ArrayList<String>(Arrays.asList("KOSTAS","TSIMIKAS","12/5/96")) );
        pp.put(663566532, new ArrayList<String>(Arrays.asList("CALVIN","RAMSAY","31/7/03")) );
        pp.put(202323338, new ArrayList<String>(Arrays.asList("NABY","KEITA","10/2/95")) );
        pp.put(202363478, new ArrayList<String>(Arrays.asList("CURTIS","JONES","30/1/01")) );
        pp.put(205334444, new ArrayList<String>(Arrays.asList("LUIS","DIAZ","13/1/97")) );
        pp.put(236343455, new ArrayList<String>(Arrays.asList("DARWIN","NUNEZ","24/6/99")) );
        System.out.println(pp);        
    }



}
