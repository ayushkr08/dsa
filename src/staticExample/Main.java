package staticExample;

public class Main {
    public static void main(String[] args) {
//        Human kunal = new Human(22, "Kunal", 10000, false);
//        Human ayush = new Human(23, "Ayush", 15000, true);
//        Human arpit = new Human(23, "arpit", 15000, true);
//
//        System.out.println(ayush.population);
//        System.out.println(kunal.population);
//        System.out.println(arpit.population);

        //greeting();
        // you cannot use this because it requires an instance but the function you are using
        // but the function you are using does not depend on instances

        // hence, here I am referencing it

        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    void greeting() {
        System.out.println("hello");
    }
}
