import java.util.*;

public class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int val = sc.nextInt();
		int flag = 0;
		for(int i = 2; i < val / 2; i ++){
			if(val == 0 || val == 1){
				flag = 1;
				break;
			}
			else{
				if(val % i == 0){
					flag = 1;
					break;
				}
				else{
					flag = 0;
				}
			}
		}
		if(flag == 0){
			System.out.println(val + " is prime");
		}
		else{
			System.out.println(val + " is not prime");
		}
	}
}
			