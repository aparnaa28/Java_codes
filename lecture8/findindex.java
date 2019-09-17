package lecture8;

import java.util.Scanner;

public class findindex {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int a[]= {10,20,30,20,50,20};
		System.out.println("Enter the element");
		int e= scn.nextInt();
		int count=0;
		//int result[]=findindex(a,0,e,0);
		findindex2(a,0,e,0);
		/*for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}*/
			
	}
	
	public static int[] findindex(int a[],int index,int e,int count)
	{
		if(index==a.length)
		{
			int[]rr = new int[count];
			return rr;
		}
		
		if(a[index]==e)
		{
			int rr[]= findindex(a,index+1,e,count+1);
			rr[count]=index;
			return rr;
		}
		else
		{
			int rr[]=findindex(a,index+1,e,count);
			return rr;
		}
	}
	
	public static void findindex2(int arr[],int index,int e,int count) {
		
		if(index==arr.length)
		{
			return;
		}
		
		if(arr[index]==e)
		{
			System.out.println(index);
			findindex2(arr,index+1,e,count+1);
		}
		else {
			findindex2(arr,index+1,e,count);
		}
	}

}
