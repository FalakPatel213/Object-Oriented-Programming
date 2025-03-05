import java.io.*;

class FIODemo {
    public static void main (String args[]) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("FIO.txt");
        fos.write(98);
        FileInputStream fis = new FileInputStream("FIO.txt");
        int data = fis.read();
        System.out.println("Data : " + data);
        fis.close();
        fos.close();
    }
}