// Write a program to demonstrate passing an object to a method to check if two object are equal or not.

class ObjectPass{
    int a, b;

    // Constructor        # Name of constructor should be same as the class
    ObjectPass(int i, int j){
        a = i;
        b = j;
    }

    // This method check whether the two objects are identical or not

    // User Defined method
    boolean equalTo(ObjectPass o){
                    // Passing object
        return (o.a==a && o.b == b);
    }

    // This method check whether the both elements of the object are equal or not.
    boolean equalTo1(){
                    // Passing object
        return (a == b);
    }
}

public class Test{
    public static void main (String args[]) {
        ObjectPass obj1 = new ObjectPass(100, 200);
        ObjectPass obj2 = new ObjectPass(100, 200);
        ObjectPass obj3 = new ObjectPass(1, 1);
        System.out.println("obj1 == obj2 " + obj1.equalTo(obj2));   // True
        System.out.println("obj1 == obj3 " + obj1.equalTo(obj3));   // False

        System.out.println("obj1 == obj3 " + obj1.equalTo1());    // False
        System.out.println("obj1 == obj3 " + obj2.equalTo1());    // False
        System.out.println("obj1 == obj3 " + obj3.equalTo1());    // True
    }
}