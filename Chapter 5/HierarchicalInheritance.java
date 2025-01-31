class GrandPatent1{
    public void gp(){
        System.out.println("Grand parent method called.");
    }
}

class Parent1 extends GrandPatent1{
    public void p(){
        System.out.println("Parnet method called.");
    }
}

class Child1 extends GrandPatent1{
    public void c(){
        System.out.println("Child method called.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        Child1 c = new Child1();
        p.p();
        p.gp();
        c.gp();
        c.c();
        // c.p();
    }
}