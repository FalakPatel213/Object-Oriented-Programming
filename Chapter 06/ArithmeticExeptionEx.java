import javax.xml.bind.ParseConversionEvent;

class ArithmeticExceptionEx{
    public static void main(String[] args) {
        try{
            int a = 1, b = 0;
            int div = a / b;
        }
        catch(ArithmeticException ex){
            System.out.println(ex);
        }
        System.out.println("Hello");
    }
}