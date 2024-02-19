import java.util.*;
public class  oops {
    public static void main(String[] args) {
        Student[] students = new Student[5];


        Student ayush = new Student(15, "Ayush Kumar", 99);

        Student rahul = new Student();


//        ayush.roll = 14;
//        ayush.name = "Ayush Kumar";
//        ayush. marks = 89.6f;

        System.out.println(ayush.roll);
        System.out.println(ayush.name);
        System.out.println(ayush.marks);
    }

}

class Student{
    int roll;
    String name;
    float marks;

    // we need a way to add the values of the above properties object by object
    //we need one word to access to every object

    void greeting() {
        System.out.println("hello my name is "+ this.name);
    }

    void changeName(String newName){
        name = newName;
    }

    Student random = new Student();


    Student (Student other) { // constructor , we don't have to return or anything name is also not req.
        this.roll = 14;
        this.name = "Ayush Kumar";
        this.marks = 88;
    }


    Student() {
        // this will how you call a contructor from another constructor
        // internally : new Student(13, "default person", 100)
        this(13, "default person", 100);
    }

    //Student arpit = new Student(17, "arpit", 89)
    // here, this will be replaced with arpit
    Student (int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}
