import java.util.*;

public class MaximumIn3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value : ");
		int val1 = sc.nextInt();
		System.out.println("Enter the second value : ");
		int val2 = sc.nextInt();
		System.out.println("Enter the second value : ");
		int val3 = sc.nextInt();
		if(val1 < val2){
			if(val2 < val3){
				System.out.println("The maximum is "+ val3);
			}
			else{
				System.out.println("The maximum is "+ val2);
			}
		}
		if(val1 > val2){
			if(val1 > val3){
				System.out.println("The maximum is "+ val1);
			}	
		}
	}
}