class GrandP{
    void message(){
        System.out.println("This is grand parent class");
    }
}

class Person extends GrandP{
    void message(){
        System.out.println("This is person class.");
    }

    void display(){
        message();
        super.message();
    }
}

class Student extends Person{
    void message(){
        System.out.println("This is student class.");
    }

    void display(){
        message();
        super.display();
    }
}

class SuperKey {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }    
}
