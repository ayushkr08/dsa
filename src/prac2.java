import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.Comparator;

public class prac2 {

    /**
     * This class shows how to sort primitive arrays,
     * Wrapper classes Object Arrays
     * @param args
     */
    public static void main(String[] args) {
        //sort primitives array like int array
//        int[] intArr = {5,9,1,10};
//        Arrays.sort(intArr);
//        System.out.println(Arrays.toString(intArr));

        //sorting String array
//        String[] strArr = {"A", "C", "B", "Z", "E"};
//        Arrays.sort(strArr);
//        System.out.println(Arrays.toString(strArr));

        //sorting list of objects of Wrapper classes
//        List<String> strList = new ArrayList<String>();
//        strList.add("A");
//        strList.add("C");
//        strList.add("B");
//        strList.add("Z");
//        strList.add("E");
//        Collections.sort(strList);
//        for(String str: strList) System.out.print(" "+str);

        //Sorting object array
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);
        empArr[4] = new Employee(2, "Ankaj", 32, 50000);

//sorting employees array using Comparable interface implementation
        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));

    }
    public static class Employee implements Comparable<Employee>{
        private int id;
        private String name;
        private int age;
        private long salary;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public long getSalary() {
            return salary;
        }

        public Employee(int id, String name, int age, int salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        @Override
        public int compareTo(Employee emp) {
            // let's sort the employee based on an id in ascending order, returns a negative,zero or a +ve integer as employee id
            //is less than, equal to, or greater than the specified object
            return (this.id - emp.id);
        }
        public String toString() {
            return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                    this.salary + "]";
        }

    }
}