import java.io.*;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\student\\Desktop\\Falak_12_D1\\abc.txt");
        if (f.createNewFile()) {
            System.out.println("New File created.");
        } else {
            System.out.println("File is already exist.");
        }
        System.out.println("--------------------------------");
        System.out.println("It exists ? " + f.exists());
        System.out.println("Byte in file " + f.length());
        System.out.println("Readable ?" + f.canRead());
        System.out.println("Writable ?" + f.canWrite());
        System.out.println("File ?" + f.isFile());
        System.out.println("Absolute ?" + f.isAbsolute());
        System.out.println("Hidden file ?" + f.isHidden());
        System.out.println("Directory ?" + f.isDirectory());
    }
}
