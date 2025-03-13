class Student implements Cloneable {
    int age;
    String name;
    Student (int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public void display () {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class TestClone {
    public static void main (String[] args) {
        try {
            Student s1 = new Student(88, "Goti");
            Student s2 = (Student)s1.clone();
            s1.display();
            s2.display();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}