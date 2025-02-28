import java.io.IOException;

class TestChained {
    public static void main(String[] args) {
        try {
            ArithmeticException ex = new ArithmeticException("ExceptionMsg");
            ex.initCause(new IOException("We are unable to send or write infinite."));
            throw ex;
        } catch (ArithmeticException ex) {
            System.out.println(ex);
            System.out.println(ex.getCause());
        }
    }
}