public class RethrowException {
    static void divide() {
        int x, y, z;
        try {
            x = 6;
            y = 0;
            z = x / y;
            System.out.println(z);
        } catch (Exception ex) {
            System.out.println("In divide method");
            System.out.println(ex);
            throw ex;
        }
    }

    public static void main(String[] args) {
        System.out.println("Start main");
        try {
            divide();
        } catch (Exception ex) {
            System.out.println("Rethrowing");
            System.out.println(ex);
        }
    }
}
