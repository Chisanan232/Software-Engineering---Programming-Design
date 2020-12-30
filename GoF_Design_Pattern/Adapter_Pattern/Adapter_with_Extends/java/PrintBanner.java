package Software_Engineering.GoF_Design_Pattern.Adapter_Pattern.Adapter_with_Extends.java;


import Software_Engineering.GoF_Design_Pattern.Adapter_Pattern.Adapter_with_Extends.Banner;
import Software_Engineering.GoF_Design_Pattern.Adapter_Pattern.Adapter_with_Extends.Print;

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }

}
