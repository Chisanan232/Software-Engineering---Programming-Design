package Software_Engineering.GoF_Design_Pattern.Template_Method_Pattern.java;

public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public void display() {
        open();
        for (int i = 0; i < 5; i ++) {
            print();
        }
        close();
    };

}
