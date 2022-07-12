package Software_Engineering.GoF_Design_Pattern.Builder_Pattern.java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class HTMLBuilder extends Builder {

    private String fileName;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        fileName = title + ".html";

        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<h1>" + str + "</h1>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (String item: items) {
            writer.println("<li>" + item + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return fileName;
    }

}
