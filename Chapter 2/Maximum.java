import java.util.*;

public class Maximum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value : ");
		int val1 = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the second value : ");
		int val2 = sc.nextInt();
		if(val1 < val2){
			System.out.println("The maximum is "+ val2);
		}
		else{
			System.out.println("The maximum is "+ val1);
		}
	}
}