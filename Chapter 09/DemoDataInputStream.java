import java.io.*;

public class DemoDataInputStream {
    public static void main (String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("Data.txt");
        DataOutputStream dout = new DataOutputStream(fout);
        dout.writeBoolean(true);
        dout.writeInt(2);
        
        FileInputStream fin = new FileInputStream("Data.txt");
        DataInputStream din = new DataInputStream(fin);
        boolean f = din.readBoolean();
        int k = din.readInt();
        System.out.println(f + " " + k);
    }
}