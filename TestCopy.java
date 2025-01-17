import java.util.*;

public class TestCopy {
    public static void main(String[] args) {
        char[] copyFrom = { 'h', 'e', 'l', 'l', 'o' };
        char[] copy2 = new char[copyFrom.length];
        System.arraycopy(copyFrom, 1, copy2, 0, 4);
        System.out.println(String.valueOf(copy2));
    }
}
