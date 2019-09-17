package lecture12;


import java.util.Scanner;

public class dice {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	int count=Boardpath(0,10,"");
	System.out.println(count);
		
	}
	
	public static int Boardpath(int curr,int end,String ans)
	{
		if (curr==end) {
			System.out.println(ans);
			return 1;
		}
		int count=0;
        for(int i=1;i<=6&&i+curr<=end;i++)
        {
        	count+= Boardpath(curr+i,end,ans+i);
        	
        }
        return count;
		
	}

}
