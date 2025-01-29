import java.util.*;

public class ExampleString {
    public static void main(String[] args) {
        String s1 = "Welcome to java";
        String s2 = s1;
        String s3 = new String("Welcome to java.");
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        String s4 = s1.replaceAll("\\s+", " ").replaceAll(" ", " ");
        System.out.println(s4);
        char[] s5 = s4.toCharArray();
        for(char c: s5){
            System.out.println(c);
        }
        String[] s6 = s1.split("\\s+");
        System.out.println(Arrays.toString(s6));
    }    
}
