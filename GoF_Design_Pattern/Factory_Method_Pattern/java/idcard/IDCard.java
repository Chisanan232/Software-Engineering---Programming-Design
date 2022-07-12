package Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.java.idcard;

import Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.java.framework.Product;


public class IDCard implements Product {

    private String owner;

    public IDCard(String owner) {
        System.out.println("Manufacture " + owner + "'s ID Card.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("Use " + owner + "'s ID Card.");
    }

    public String getOwner() {
        return owner;
    }

}
