public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int a[] = { 1, 2, 3 };
            System.out.println(a[4]);
            try {
                int x = a[1] / 0;
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
