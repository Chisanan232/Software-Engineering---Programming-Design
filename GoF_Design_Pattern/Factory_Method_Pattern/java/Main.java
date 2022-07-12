package Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.java;


import Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.scala.framework.Factory;
import Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.scala.framework.Product;
import Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.scala.idcard.IDCardFactory;


public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Michael Jordan");
        Product card2 = factory.create("Kobe Bryant");
        Product card3 = factory.create("Lebron James");

        card1.use();
        card2.use();
        card3.use();
    }

}
