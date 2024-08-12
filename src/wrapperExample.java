public class wrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        Integer a = 10;
//        Integer b = 20;

        swap(a, b);
        System.out.println(a + " " + b);


//        final int BONUS = 2;


//        final A kunal = new A("Kunal kushwaha");
//        kunal.name = "Other name";
        // when a non primitive is final, you cannot reassign it
//        kunal = new A(" new object");


    }
        static void swap (int a, int b){
            int temp = a;
            a = b;
            b = temp;
        }


}

//class A {
//    final int num = 10;
//    String name;
//
//    public A(String name) {
//        this.name = name;
//    }
//}

