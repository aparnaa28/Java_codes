package lecture4;

import java.util.Scanner;

public class arraymax {

	public static void main(String[] args) {
	
	int a[],max;
    a = Takeinput();
	//display(a);
	max=min(a);
	System.out.println(max);
	//System.out.println("Enter the element to be searched");
	//int num= scn.nextInt();
	//int index = search(a,num);
	//System.out.println(index);
	
		
	}
	static Scanner scn= new Scanner(System.in);
	
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
	
	public static int min(int []arr)
	{
		int min= arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
			 min=arr[i];
			}
		}
		return min;
	}
	
	public static int search(int []arr,int e)
	{int i = 0;
		for(;i<arr.length;i++)
		{
			if(arr[i]==e)
			{
			  return i;
			}
		}
			return -1;		
	}

}
