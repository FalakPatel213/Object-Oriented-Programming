import java.util.*;

class IteratorEx {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(10);
        n.add(30);
        n.add(20);
        System.out.println("Array List = " + n);
        Iterator<Integer> i = n.iterator();
        System.out.println("Iterator over arraylist.");
        while(i.hasNext()) {
            System.out.print(i.next() + " , ");
        }
    }
}