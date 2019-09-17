package lecture4;

import java.util.Scanner;

public class reversearray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[];
		a= takeinput();
		//display(a);
		reverse(a);

	}
	
	
	public static int[] takeinput()
	{
		System.out.println("Enter the size");
		int n= scn.nextInt();
		int []arr= new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= scn.nextInt();
		}
		return arr;
	}
	
	public static void display(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void reverse(int []arr)
	{
		int []n= new int [arr.length];
		System.out.println("The reversed elements are");
		for(int i=0;i<arr.length;i++)
		{
			n[i]=arr[arr.length-(i+1)];
		}
		display(n);
	}

}
