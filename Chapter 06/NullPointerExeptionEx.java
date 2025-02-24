class NullPointerExeptionEx {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.charAt(0));
        }
        catch(NullPointerException ex){
            System.out.println(ex);
        }
    }    
}
