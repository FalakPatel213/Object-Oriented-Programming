import java.util.*;

public class ComparableInterface implements Comparable <ComparableInterface> {
    private String name;
    private int id;
    
    public ComparableInterface (String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId () {
        return this.id;
    }

    public int compareTo (ComparableInterface ob) {
        if (this.getId () == ob.getId ()) {
            return 0;
        } else if (this.getId () > ob.getId ()) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        ComparableInterface c1 = new ComparableInterface ("Audi", 5);
        ComparableInterface c2 = new ComparableInterface ("BMW", 4);
        ComparableInterface c3 = new ComparableInterface ("Mercedes", 3);
        ComparableInterface c4 = new ComparableInterface ("Toyota", 2);
        
        ArrayList <ComparableInterface> arr = new ArrayList <ComparableInterface> ();
        arr.add(c1);
        arr.add(c2);
        arr.add(c3);
        arr.add(c4);

        for(ComparableInterface c : arr) {
            System.out.println(c.getId ());
        }

        System.out.println("After compare");
        Collections.sort(arr);
        for(ComparableInterface c : arr) {
            System.out.println(c.getId ());
        }
    }
}