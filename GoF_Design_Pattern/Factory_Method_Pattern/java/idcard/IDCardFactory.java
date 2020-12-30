package Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.java.idcard;

import Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.java.framework.Factory;
import Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.java.framework.Product;

import java.util.ArrayList;
import java.util.List;


public class IDCardFactory extends Factory {

    private List owners = new ArrayList<String>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }

}
