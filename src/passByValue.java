public class passByValue {
    public static void main(String[] args) {
        MyObject obj = new MyObject();
        obj.value = 10;
        modify(obj);
        System.out.println("after method call, obj.value = " + obj.value); // obj.value will be 20


    }

    public static void modify(MyObject o) {
        o.value = 20; // this changes the value inside the object that both references point to
    }
}
