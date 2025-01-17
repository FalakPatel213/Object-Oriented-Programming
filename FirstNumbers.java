import java.util.*;

public class FirstNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of numbers : ");
		int Pcount = sc.nextInt();
		int count = 0;
		for(int num = 0; count < Pcount; num ++){
			int flag = 0;
			if(num == 0 || num == 1){
				flag = 1;
			}
			for(int i = 2; i <= num / 2; i ++){
				if(num % i == 0){
					flag = 1;
					break;
				}
			}
			if(flag == 0){
				System.out.println(num);
				count ++;
			}
		}
	}
}