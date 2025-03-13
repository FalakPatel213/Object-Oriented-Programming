import java.util.*;

class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList <> ();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List = " + numbers);
        int num = numbers.get(2);
        System.out.println("Element at index 2 = " + num);
        numbers.set(2, 2000);
        System.out.println("Replaced 3rd element = " + numbers);
        int removedNumber = numbers.remove(1);
        System.out.println("Removed element at index 1 = " + removedNumber);
        System.out.println("Does list have 1000 ? " + numbers.contains(1000));
        numbers.remove(Integer.valueOf(1000));
        System.out.println("Removed 1000 = " + numbers);
        numbers.clear();
        System.out.println("List after clear = " + numbers);
    }
}