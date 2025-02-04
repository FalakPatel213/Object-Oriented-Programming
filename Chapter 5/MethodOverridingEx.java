class Parent{
    void show(){
        System.out.println("Parent's show");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("Child's show");
    }
}

class MethodOverridingEx{
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.show();
        
        Parent obj2 = new Child();     // Dynamic Polymorphism, Dyanamic method dispatch, runtime polymorphism
        obj2.show();

        Child obj3 = new Child();
        obj3.show();
    }
}


// With the keyword "final", we cannot inherit the child.