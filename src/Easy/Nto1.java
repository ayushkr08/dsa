package Easy;

public class Nto1 {
    public static void main(String[] args) {
        //fun(5);
        funBoth(5);
    }
    static void fun(int n) {
        //base
        if(n == 0) {
            return;
        }
        System.out.print(n+ " ");
        fun(n-1);
    }

    static void funRev(int n) {
        //base
        if(n == 0) {
            return;
        }
        funRev(n-1);
        System.out.print(n+ " ");
    }

    static void funBoth(int n) {
        //base
        if(n == 0) {
            return;
        }
        System.out.print(n+ " ");
        funBoth(n-1);
        System.out.print(n+ " ");
    }
}
