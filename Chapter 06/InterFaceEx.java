interface InterfaceEx {
    void getName (String name);
}

class ProgrammingLang implements InterfaceEx {
    public void getName (String name) {
        System.out.println("Programming lang : " + name);
    }
    public static void main(String[] args) {
        ProgrammingLang p = new ProgrammingLang();
        p.getName("Java");
    }
}