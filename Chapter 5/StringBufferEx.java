public class StringBufferEx{
    public static void main(String[] args){
        StringBuffer s1 = new StringBuffer("Welcome to Java");
        System.out.println("Capacity = length * 2 + 1 " + s1.capacity());
        System.out.println(s1.charAt(0));
        System.out.println(s1.length());
        System.out.println(s1.substring(11));
    }
}