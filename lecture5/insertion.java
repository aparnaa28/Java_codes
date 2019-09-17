package lecture5;

import java.util.Scanner;

public class insertion {
	public static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) {
		int a[];
		a= Takeinput();
		display(a);
		insertion(a);
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
	
	public static void insertion(int []arr)
	{
		int item=0,j;
	
		for(int counter=1;counter<=arr.length-1;counter++)
		{ 
			item= arr[counter];
		    j=counter-1;
			while(j>=0 && arr[j]>item)
		{
			arr[j+1]=arr[j];
			j--;
		}
			
			arr[j+1]=item;
		}	
		display(arr);
		
	}

}
