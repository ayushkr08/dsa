import java.util.*;
public class hashMapUse {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nums = {1, 2, 2, 3, 1, 4};

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

//        for (HashMap.Entry<Integer, Integer> mp : map.entrySet()) {
//            System.out.println(mp.getKey() + " = " + mp.getValue());
//        }
        int max = 0;
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            int frequency = entry.getValue();
            //System.out.println(frequency);
            if (frequency > max) {
                max = frequency;
            }
        }
        int count = 0;
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getValue());
            System.out.println(max);
            if (entry.getValue() == max) {
//                count++;
                count = count + max;
            }
        }
//        System.out.println(count);
        //System.out.println(count);



    }
}
