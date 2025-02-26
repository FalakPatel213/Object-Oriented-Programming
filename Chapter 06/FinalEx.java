public class FinalEx {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0;
            int c = a / b;
            System.out.println(c);
        } finally { // This will run even if the program has exception or error
            System.out.println("I am blocked.");
        }
        System.out.println("dgjsdfgkadfjglkj");
        ;
    }
}