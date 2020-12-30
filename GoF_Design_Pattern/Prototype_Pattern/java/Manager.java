package Software_Engineering.GoF_Design_Pattern.Prototype_Pattern.java;

import Software_Engineering.GoF_Design_Pattern.Prototype_Pattern.java.framework.Product;

import java.util.HashMap;


public class Manager {

    private HashMap showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }

}
