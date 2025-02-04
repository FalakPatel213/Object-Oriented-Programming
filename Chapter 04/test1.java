//DESIGN A JAVA CLAS RECTANGLE WHICH CONTAINS FOLLOWING FIELD AND METHOD 
//1 - FIELD:LENGTH ,WIDTH
//2-DEFAULT CONSTRUCTOR  INTIALIZE ALL FIELD WITH ZERO
//3-METHOD - INT GETAREA() WILL RETRUN AREA OF RECTANGLE


import java.util.*;

class Rectangle{
    int length;
    int width;

    Rectangle(){
        this.length = 0;
        this.width = 0;
    }

    int getarea(){
        return this.length*this.width;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            rectangle rs = new rectangle();
            System.out.println("enter length and width :  ");
            rs.length = sc.nextInt();
            rs.width = sc.nextInt();
            System.out.println(rs.getarea());
    }
}