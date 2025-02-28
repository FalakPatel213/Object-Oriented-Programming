import java.io.*;

public class ExFileList {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\student\\Desktop\\Falak_12_D1");
        String filenames[] = f.list();
        for(String filename : filenames) {
            System.out.println(filename);
        }
    }
}
