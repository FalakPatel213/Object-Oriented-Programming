import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExPrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        String data = "This is the text inside this file.";
        try {
            PrintWriter pout = new PrintWriter("out.txt");
            int age = 35;
            pout.println("I am " + age + " years old.");
            pout.printf(data);
            pout.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
