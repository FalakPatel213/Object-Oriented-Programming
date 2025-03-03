interface intf1 {
    void StudentName ();
}

interface intf2 extends intf1 {
    void StudentInstitute ();
}

class Sample implements intf2 {
    public void StudentName () {
        System.out.println("My name");
    }

    public void StudentInstitute () {
        System.out.println("NLJIET");
    }

    public static void main(String[] args) {
        Sample ob1 = new Sample();
        ob1.StudentName();
        ob1.StudentInstitute();
    }
}