package Software_Engineering.GoF_Design_Pattern.Singleton_Pattern.java;


public class Main {

    public static void main(String[] args) {
        System.out.println("Testing Program start.");

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("Instance s1 and instance s2 are the same instance.");
        } else {
            System.out.println("Instance s1 and instance s2 are NOT the same instance.");
        }

        System.out.println("Testing Program end.");
    }

}
