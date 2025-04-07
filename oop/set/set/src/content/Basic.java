package content;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * HashSet -> fastest, order doesn't important
 * TreeSet -> Slow. Order is important . Alphabetic order
 * LinkedHashSet -> Intermediary. Order is by insertion
 * */

public class Basic {
    public static void main(String[] args) {
        //Set<String> set = new HashSet<>();
        //Set<String> set = new TreeSet<>();
        Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("Laptop");
        set.add("Tablet");

        //System.out.println(set.contains("Laptop"));

        //set.remove("Tablet");
        //set.removeIf(x -> x.length() >= 3);
        set.removeIf(x -> x.charAt(0) == 'T');

        for (String s : set) {
            System.out.println(s);

        }
    }
}
