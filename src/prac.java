import java.util.Arrays;

public class prac {
    public static void main(String[] args) {
        fun(1,2,4,5,6,4,12,323,1);
    }
    //if we dont know, how many integer(not only integer,string,char..) will be there(so we use varargs-> eg. int ...v)
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}




