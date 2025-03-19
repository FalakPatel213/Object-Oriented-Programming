import java.util.*;

public class EnumeratorEx {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Jan");
        v.add("Feb");
        v.add("March");
        v.add("April");
        Enumeration <String> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}

