package lecture12;


import java.util.Scanner;

public class toss {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the no of tosses");
		int n=scn.nextInt();
	int count=cointoss(n,"");	
	System.out.println(count);
	}
	
	public static int cointoss(int n,String ans) {
		if (n == 0) {
			System.out.println(ans);
			return 1;
		}
		
		int count=0;
		count+=cointoss(n-1,'H'+ans);
		count+=cointoss(n-1,'T'+ans);

		return count;
	}

}
