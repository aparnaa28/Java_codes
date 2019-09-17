package lecture4;

import java.util.Scanner;

public class selectionsort {
	public static Scanner scn= new Scanner(System.in);

	public static void main(String[] args) {
     int a[];
     a= Takeinput();
    // display(a);
     selectionsort(a);
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
	
	public static void selectionsort(int []arr)
	{
		int j;
		for(int i=0;i<arr.length-1;i++)
		{
			int min=i;
			for( j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			int temp= arr[min];
			arr[min]= arr[i];
			arr[i]= temp;
		}
		display(arr);
	}

}
