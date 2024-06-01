package singleton;

public class Singleton {

    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        //Check wheather 1 object is created or not
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
