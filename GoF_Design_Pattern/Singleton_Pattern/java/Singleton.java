package Software_Engineering.GoF_Design_Pattern.Singleton_Pattern.java;


public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("Generate a instance right now.");
    }

    public static Singleton getInstance() {
        return singleton;
    }

}
