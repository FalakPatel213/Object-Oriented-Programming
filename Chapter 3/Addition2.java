// Pass by value

public class Addition2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        c = add(a, b);
        System.out.println("The addition of "+ a + "and "+ b +"is "+ c);
    }

    public static void add(int a, int b) {
        int s = a + b;
        return s;
    }
}