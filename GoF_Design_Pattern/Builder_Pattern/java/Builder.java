package Software_Engineering.GoF_Design_Pattern.Builder_Pattern.java;


public abstract class Builder {

    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();

}
