import javax.swing.plaf.synth.SynthDesktopIconUI;

public class Variable {
    int y; // Instance variable
    static int z; // Static variable

    public static void main(String args[]) {
        int x; // Local variable
        x = 4;
        System.out.println(x);

        Variable ob = new Variable();
        ob.y = 10;
        System.out.println(ob.y);

        Variable ob1 = new Variable();
        ob1.y = 20;
        System.out.println(ob1.y);

        Variable ob2 = new Variable();
        ob2.y = 30;
        System.out.println(ob2.y);

        z = 50;
        System.out.println(z);
    }
}