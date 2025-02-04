//DESIGN A JAVA CLAS RECTANGLE WHIC CONTAINS FOLLOWING FIELD AND METHOD 
//1 - FIELD:LENGTH ,WIDTH
//2-DEFAULT CONSTRUCTOR  INTIALIZE ALL FIELD WITH ZERO
//3-METHOD - INT GETAREA() WILL RETRUN AREA OF RECTANGLE
 

//second method using static----------------------
import java.util.*;

class rectangle{
    static int length;
    static int width;

    int getarea(){
        return length*width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("enter length and width :  ");
       length = sc.nextInt();
        width = sc.nextInt();
        System.out.println(getarea());

    }
}