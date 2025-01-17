public class Typecasting {
    public static void main(String args[]) {
        int myInt = 9;
        double myD = myInt; // Auto Conversion
        System.out.println(myInt);
        System.out.println(myD);

        double myD1 = 9.654;
        int myInt1 = (int) myD1; // Auto Conversion
        System.out.println(myD1);
        System.out.println(myInt1);
    }
}