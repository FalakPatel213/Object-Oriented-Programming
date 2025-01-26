final class ImmutableClass {
    private String name;

    ImmutableClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class FinalClass {
    public static void main(String[] args) {
        ImmutableClass obj = new ImmutableClass("New LJ");
        System.out.println("Name " + obj.getName());
    }
}
