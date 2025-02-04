// "this" keyword is used to refer current class instance variable.

class Student {

    // Instance variables
    int rno;
    String name;

    // Accesing instance variable by "this" keyword.
    Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    void display() {
        System.out.println(rno + " " + name);
    }
}

public class TestThis {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Aditya");
        Student s2 = new Student(2, "Aaryan");
        s1.display();
        s2.display();
    }
}