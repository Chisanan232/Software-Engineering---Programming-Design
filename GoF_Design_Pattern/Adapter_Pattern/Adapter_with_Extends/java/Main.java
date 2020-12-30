package Software_Engineering.GoF_Design_Pattern.Adapter_Pattern.Adapter_with_Extends.java;

import Software_Engineering.GoF_Design_Pattern.Adapter_Pattern.Adapter_with_Extends.Print;
import Software_Engineering.GoF_Design_Pattern.Adapter_Pattern.Adapter_with_Extends.PrintBanner;

public class Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }

}
