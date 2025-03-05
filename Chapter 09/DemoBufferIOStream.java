import java.io.*;

public class DemoBufferIOStream {
    public static void main (String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("Bufout.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Hello World...";
        byte ob[] = s.getBytes();
        bout.write(ob);
        bout.flush();
        bout.close();
        FileInputStream fin = new FileInputStream("Bufout.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        byte[] ib = new byte[bin.available()];
        bin.read(ib);
        for (byte bt : ib) {
            char c = (char) bt;
            System.out.print(bt);
        }
        fin.close();
    }
}