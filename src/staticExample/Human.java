package staticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;

     static long population;

    static void message() {
        System.out.println("hello world");
        // you cant use this keyword inside static method
        // this actually represents an object, and you are in static, static itself does not depend on the object(so how can we use this, which is dependent on the static)
        //System.out.println(this.age);
    }



    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;

        Human.message();
    }
}
