import java.util.Vector;

class VectorEx {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        v.add("Cherry");
        v.addElement("Date");
        System.out.println("Element at index 1 = " + v.get(1));
        v.remove("Banana");
        v.removeElement("Date");
        System.out.println("Size of vector = " + v.size());
        System.out.println("Containing apple = " + v.contains("Apple"));
        System.out.println("Index of cherry = " + v.indexOf("Cherry"));
        System.out.println("Is vector enpty = " + v.isEmpty());
        System.out.println("First element = " + v.firstElement());
        System.out.println("Capacity = " + v.capacity());
    }    
}
