class Generic <T> {
    T value;
    void show () {
        System.out.println(value);
    }
}

public class GenericEx {
    static <T> void genericPrint (T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main (String[] args) {
        Generic <Integer> obj = new Generic <Integer> ();
        obj.value = 10;
        obj.show();
        System.out.println("Method ");
        genericPrint(10);
        genericPrint(1.0);
    }
}