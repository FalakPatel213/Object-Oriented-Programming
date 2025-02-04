class GrandPatent{
    public void gp(){
        System.out.println("GP method called.");
    }
}

class Parent extends GrandPatent{
    public void p(){
        System.out.println("Parent method called.");
    }
}

class Child extends Parent{
    public void c(){
        System.out.println("Child method called.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.gp();
        c.p();
        c.c();
    }
}
