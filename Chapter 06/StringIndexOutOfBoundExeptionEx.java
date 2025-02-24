class StringIndexOutOfBoundExeptionEx {
    public static void main(String[] args) {
        try {
            String str = "This is null";
            System.out.println(str.length());
            char c = str.charAt(20);
            System.out.println(c);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
