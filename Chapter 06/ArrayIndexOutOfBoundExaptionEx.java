class ArrayIndexOutOfBoundExaptionEx {
    public static void main(String[] args) {
        int num[] = {10, 20, 30, 40};
        try{
            System.out.println(num[6]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
    }
}
