import java.util.*;

public class TreeSetEx {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Sorted tree set: " + treeSet);
        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());
        System.out.println("PollFirst(): " + treeSet.pollFirst());
        System.out.println("PollLast(): " + treeSet.pollLast());
        System.out.println("New tree set: " + treeSet);
    }
}
