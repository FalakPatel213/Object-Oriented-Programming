class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    public void Display() {
        System.out.println(id + " " + name);
    }
}

public class Parameterization { // This name should excatly same as per the file name no change.
    public static void main(String[] args) {
        Student S1 = new Student(1, "Jay");
        Student S2 = new Student(2, "Ram");
        S1.Display();
        S2.Display();
    }
}

// In a single file, if more then two classes are defined then only one should
// be public class.
// The public class containing main method should be public.