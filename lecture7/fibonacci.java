package lecture7;

import java.util.Scanner;

public class fibonacci {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the nth fibonacci");
		int n= scn.nextInt();
		int result;
		result=fibonacci(n);
		System.out.println(result);

	}
	
	public static int fibonacci(int n)
	{
		if(n==0||n==1)
			return n;
		
		int fnm1= fibonacci(n-1);
		int fnm2= fibonacci(n-2);
		int fnm= fnm1+fnm2;
		return fnm;
	}

}
