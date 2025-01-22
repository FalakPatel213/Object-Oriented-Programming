public class Shift{
	public static void main(String args[]){
		System.out.println(20 >> 2);
		System.out.println(20 >>> 2);
		System.out.println(-20 >> 2);
		System.out.println(-20 >>> 2);
		//System.out.println(-20 <<< 2);    // Invalid
	}
}

// Java does not support left shift(<<<)