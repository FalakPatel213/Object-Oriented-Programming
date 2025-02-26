public class TestMultiCatch {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt("Old Monk");
            System.out.println(1 / 0);
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
