package lecture8;

import java.util.Scanner;

public class firstendindex {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int a[]= Takeinput();
		System.out.println("Enter the element");
		int e= scn.nextInt();
		int result=endindex(a,e,0);
		System.out.println(result);	
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
	
	public static int endindex(int arr[],int e,int i)
	{
		if(i==arr.length)
			return -1;
		
		 int rr= endindex(arr,e,i+1);
		if(arr[i]==e&&rr==-1)
		{
			return i;
		}
		else
		return rr;
		
			
	}

}
