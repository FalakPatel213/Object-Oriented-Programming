// String is immutable.

class Immutable {
    public static void main(String[] args) {
        String name = "ABC";
        name = name + "XYZ";
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(name);
        System.out.println(s1);
        System.out.println(s2);
    }
}


// The class with no set method is immutable it has only get method.
// String class is final class.