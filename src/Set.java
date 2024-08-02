import java.util.*;

public class Set {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("B");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("z");
        hs.add("K");

        System.out.println(hs);
        System.out.println(hs.contains("B"));

        //Iteration through the Set via for-each loop
        for(String value : hs) {
            System.out.print(value + ", ");
        }
        System.out.println();

    }
}
