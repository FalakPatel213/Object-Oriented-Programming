import java.util.*;

class InputMismatchExceptionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter value of a : ");
            int a = sc.nextInt();
            System.out.println(a * a);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
