import java.io.*;
import java.util.*;

public class ExScanner {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("out.txt");
        Scanner sc = new Scanner(f);
        String word;
        while (sc.hasNext()) {
            word = sc.nextLine();             // sc.next() to print individual words.
            System.out.println(word);
        }
        sc.close();
    }
}
