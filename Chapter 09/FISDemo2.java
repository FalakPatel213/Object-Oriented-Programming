import java.io.*;

class FISDemo2 {
    public static void main (String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("FIS.txt");
        String s = "Learning I/O Stream.";
        int i = 0;
        byte b[] = s.getBytes();
        fos.write(b);
        fos.close();
        FileInputStream fis = new FileInputStream("FIS.txt");
        while ((i = fis.read()) != -1) {
            System.out.println((char) i);
        }
        fis.close();
    }
}