import java.util.ArrayList;
import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //selection_sort(arr,n);
        bubble_sort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static void bubble_sort(int arr[], int n){
        for(int i =n-1; i>=0;i--){
            int didSwap = 0;  // taking a flag to check whether it is already sorted or not
            for(int j =0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){ // this is to optimise or to show the best case, O(n) that is if
                break;
            }
            System.out.println("runs ");
        }
    }
    /*static void swap(int x,int y){
        int temp = y;
        y  = x;
        x = temp;
    }*/



    static void selection_sort(int arr[], int n){
        for(int i =0;i<=n-2;i++){
            int mini = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
                int temp = arr[mini];
                arr[mini] = arr[i];
                arr[i] = temp;
            }
        }
    }
}