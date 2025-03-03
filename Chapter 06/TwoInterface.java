interface PersonA {
    public void walk();
}

interface PersonB {
    public void run();
}

class Person implements PersonA, PersonB {
    public void walk () {
        System.out.println("Walking...");
    }
    public void run () {
        System.out.println("Running...");
    }
}

class TwoInterface {
    public static void main(String[] args) {
        Person p = new Person();
        p.walk();
        p.run();
    }
}