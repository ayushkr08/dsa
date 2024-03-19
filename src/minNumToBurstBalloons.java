import java.util.Arrays;
import java.util.Comparator;

public class minNumToBurstBalloons {
    public static void main(String[] args) {
        int[][] arr = {{10,16}, {2,8}, {1,6}, {7,12}};
        Arrays.sort(arr, Comparator.comparing(a -> a[1]));
        int arrows = 1;
        int end = arr[0][1];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i][0] > end) {
                arrows++;
                end = arr[i][1];
            }
        }
        System.out.println(arrows);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(Arrays.toString(arr[i]));
//        }
    }
}
