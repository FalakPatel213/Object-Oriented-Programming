public class ConstructorOverLoading {
    int id;
    String name;
    int age;

    ConstructorOverLoading(int i, String n){
        id = i;
        name = n;
    }
    
    ConstructorOverLoading(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }
    
    void Display(){
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]){
        ConstructorOverLoading s1 = new ConstructorOverLoading(1, "Jay");
        ConstructorOverLoading s2 = new ConstructorOverLoading(2, "Ram", 21);
        s1.Display();
        s2.Display();
    }
}