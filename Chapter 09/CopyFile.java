import java.io.*;

class CopyFile {
    public static void main (String[] args) throws IOException {
        FileInputStream fcopy = new FileInputStream("FIS.txt");
        FileOutputStream fis = new FileOutputStream("Cpy.txt");
        int c;
        while ((c = fcopy.read()) != -1) {
            fis.write(c);
        }
    }
}