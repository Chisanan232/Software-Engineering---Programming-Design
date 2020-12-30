package Software_Engineering.GoF_Design_Pattern.Adapter_Pattern.Adapter_with_Delegation.java;


public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String string) {
        banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }

}
