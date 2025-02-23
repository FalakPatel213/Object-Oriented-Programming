// QB page 15, Q 16.

import java.util.*;

class Acc {
    int AccNo = 0;
    String Name = null;
    double Balance = 0;

    void display(){
        System.out.println("Account no : " + AccNo);
        System.out.println("Name : " + Name);
        System.out.println("Balance : " + Balance);
    }

    void setData(int AccNo, String Name, double Balance){
        this.AccNo = AccNo;
        this.Name = Name;
        this.Balance = Balance;
    }

    void diposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit : ");
        double dep = sc.nextDouble();
        sc.close();

        this.Balance = this.Balance + dep;
    }
}

public class Account{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account no :");
        int acc_no = sc.nextInt();

        System.out.println("Enter the name :");
        String name_user = sc.next();

        System.out.println("Enter the Balance:");
        double bal = sc.nextDouble();

        sc.close();

        Acc ob = new Acc();
        ob.setData(acc_no, name_user, bal);

        System.out.println("\n");
        System.out.println("The data of the user is : ");
        ob.display();

        System.out.println("\n");

        ob.diposit();
        System.out.println("\n");

        ob.display();
    }
}