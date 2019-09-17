package lecture4;

import java.util.Scanner;

public class inverse {
	public static Scanner scn= new Scanner(System.in);

	public static void main(String[] args) {
		int a[],na[],flag=0,check[];
		System.out.println("Enter the size of the array");
		int n= scn.nextInt();
		a= Takeinput(n);
		//display(a);
		na= Takeinput(n);
		check= inverse(a);
		//display(n);
		for(int i=0;i<a.length;i++)
		{
			if(check[i]==na[i])
			{
				flag=0;
			}
			else
			{
				flag=1;
				break;
			}
	
		}
		
			if(flag==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	public static int [] Takeinput(int n)
	{
		int []arr= new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
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
	
	public static int[] inverse(int []arr)
	{
		int []n= new int [arr.length];
		for(int i=0;i<arr.length;i++)
		{
			n[arr[i]]=i;
		}
		return n;
	}

}
