import java.util.*;

class StackEx {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("Apple");
        s.push("Banana");
        s.push("Cherry");
        System.out.println("Top element is = " + s.peek());
        System.out.println("Poped element is = " + s.pop());
        System.out.println("Position of apple is = " + s.search("Apple"));
        System.out.println("Is stack empty = " + s.isEmpty());
        System.out.println("Size of stack = " + s.size());
        
    }    
}
