package Software_Engineering.GoF_Design_Pattern.Template_Method_Pattern.java;


public class CharDisplay extends AbstractDisplay {

    private String ch;

    public CharDisplay(String string) {
        this.ch = string;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }

}
