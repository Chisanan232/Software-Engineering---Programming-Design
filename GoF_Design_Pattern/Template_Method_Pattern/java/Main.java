package Software_Engineering.GoF_Design_Pattern.Template_Method_Pattern.java;


public class Main {

    public static void main(String[] args) {
        AbstractDisplay cd1 = new CharDisplay("Hello, World");
        AbstractDisplay sd1 = new StringDisplay("Hello, World");

        cd1.display();
        sd1.display();
    }

}
