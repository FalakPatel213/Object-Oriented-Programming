import javax.swing.plaf.synth.SynthOptionPaneUI;

// Deep Copy

class XYZ{
    int x = 30;
}

public class DeepCopy {
    public static void main(String[] args) {
        XYZ obj1 = new XYZ();
        XYZ obj2 = new XYZ();
        obj2. x = 6;
        System.out.println("x = " + obj1.x);
        System.out.println("x = " + obj2.x);
    }
}
