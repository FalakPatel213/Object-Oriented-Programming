import java.util.*;

public class SwitchCase{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		System.out.println("Enter the weight : ");
		int weight = sc.nextInt();
		if(age > 18 && weight > 60){
			System.out.println("Qualified");
		}
		else{
			System.out.println("Not Qualified");
		}
	}
}