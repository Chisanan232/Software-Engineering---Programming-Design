package Software_Engineering.GoF_Design_Pattern.Prototype_Pattern.java.framework;


public interface Product extends Cloneable {

    public abstract void use(String s);

    public abstract Product createClone();

}
