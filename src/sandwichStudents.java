import java.util.*;
import java.util.HashMap;
public class sandwichStudents {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        map.put(2, 400);
        map.put(3, 200);
        map.put(4, 400);



        for(int num : map.values()) {
            System.out.println("values " + num);
        }
    }



}
