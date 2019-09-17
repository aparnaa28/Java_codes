package lecture4;

import java.util.Scanner;

public class rotatearray {
 public static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) {
	int a[],n[];
	a=Takeinput();
	System.out.println("Enter the rotation");
	int r= scn.nextInt();
	n= rotate(a,r);
	display(n);

	}
	
	public static int [] Takeinput()
	{
		System.out.println("Enter the size of the array");
		int n= scn.nextInt();
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
	
	public static int[] rotate(int arr[],int r)
	{
		int []n= new int [arr.length];
		  
		while(r<0)
		{
		  r= arr.length+r;
		} 
		
		r=r%arr.length;
		for(int i=0;i<arr.length;i++)
		{
			if(i<r)
			{
				n[i]=arr[arr.length+i-r];
			}
			else
			{
				n[i]= arr[i-r];
			}
			
		}
		
		return n;
	}

}
