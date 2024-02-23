public class pascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        // find the nth row sum of the pascal traingle
        int nthRowSum = 0;
        nthRowSum = 1 << (n-1);
        System.out.println(nthRowSum);

    }
}
