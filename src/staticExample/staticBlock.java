package staticExample;

public class staticBlock {

    static int a = 4;
    static int b;

    //we want to initialise static variables
    //we use static block --> this will be executed once when the class will be loaded

//    static {
//        System.out.println("I am in static block");
//
//        b = a * 5;
//    }
    //static run only once when the 1st object is created i.e. when the class is loaded for the 1st time
    static {
        System.out.println("I am in the static block");
        b = a * 5;
}

    public static void main(String[] args) {
        staticBlock obj = new staticBlock();

        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock.b += 3;
        System.out.println(staticBlock.a + " " + staticBlock.b);


        staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);
    }
}
