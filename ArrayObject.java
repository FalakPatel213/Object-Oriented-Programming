import java.util.*;

class Student {
    int java;
    int CO;
    int OS;
}

public class ArrayObject {
    public static void main(String args[]) {
        Student[] stdArr = new Student[2];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < stdArr.length; i ++){
            stdArr[i] = new Student();
        }

        System.out.println("Enter the marks : ");
        for(Student s : stdArr){
            s.java = sc.nextInt();
            s.CO = sc.nextInt();
            s.OS = sc.nextInt();

        }

        System.out.println("Java CO OS");

        for(Student x : stdArr){
            System.out.println(x.java + "  " + x.CO + " " + x.OS + " ");
        }
    }
}
