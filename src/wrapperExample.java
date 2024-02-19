public class wrapperExample {
    public static void main(String[] args) {
//        int a = 10;  // this is primitive data type
//        int b = 20;


        Integer a = 10;
        Integer b = 20;

        Integer num = 45;  // this is created like object ( known as wrapper class )

        swap(a,b);  // this does not swap the values aas the Integer is the "final"

        System.out.println(a + " "+ b);


        A kumal = new A("Kunal kush");
        kumal.name  = "other name";

        A obj = new A("Random");
        System.out.println(obj);

//        for(int i=0;i<1000000; i++){
//            obj = new A("Random name");
//        }

        //when a non primitive is final, you cannot ressign it.


//        final int bonus = 2;
//         bonus  =3 ;    //Cannot assign a value to final variable 'bonus'

        // using primitve as an object
    }
        static void swap (Integer a, Integer b){
            Integer temp = a;
            a = b;
            b = temp;
        }
}
class A {
    final int num = 10;
    String name;

    public A(String name) {
        //System.out.println("object is created");
        this.name = name;
    }


}

