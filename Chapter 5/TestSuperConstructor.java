// Super keyword to invoke parent class constructor.

class Person{
    Person(){         // Constructor of Person class.
        System.out.println("Person class constructor.");
    }
}

class Student extends Person{
    Student(){       // Constructor of Student class.
        super();
        System.out.println("Student class constructor.");
    }
}

class TestSuperConstructor{
    public static void main(String[] args) {
        Student s = new Student();
    }
}
