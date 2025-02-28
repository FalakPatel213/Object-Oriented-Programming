class YoungerAgeException extends RuntimeException {
    YoungerAgeException (String msg) {
        super(msg);
    }
    YoungerAgeException () {
        super("You are under age");
    }
}

public class TestException {
    static void ValidDate (int age) throws YoungerAgeException {
        if (age < 18) { 
            throw new YoungerAgeException();
        } else { 
            System.out.println("You are above 18, F*** off....");
        }
    }

    public static void main(String[] args) {
        try {
            ValidDate(19);
            ValidDate(11);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("Rest of the code...");
    }
}