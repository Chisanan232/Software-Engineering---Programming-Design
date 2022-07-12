package Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.java.framework;


public abstract class Factory {

    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);

}
