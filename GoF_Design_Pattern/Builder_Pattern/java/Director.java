package Software_Engineering.GoF_Design_Pattern.Builder_Pattern.java;


public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("從早到晚");
        builder.makeItems(new String[] {
                "Good morning",
                "Good afternoon"
        });

        builder.makeString("晚上");
        builder.makeItems(new String[] {
                "晚上好",
                "晚安",
                "再見"
        });

        builder.close();
    }

}
