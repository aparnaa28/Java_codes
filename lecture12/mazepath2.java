package lecture12;

import java.util.ArrayList;
import java.util.Scanner;

public class mazepath2 {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int rows=scn.nextInt();
		int cols=scn.nextInt();
		//System.out.println(mazepath2(0,0,rows-1,cols-1,""));
	     mazepath1(0,0,rows,cols,"");
	
	}
	
	public static int mazepath1(int cr,int cc,int er,int ec,String ans)
	{
		if (cr==er&&cc==ec) {
			System.out.println(ans);
			return 1;
		}
		
		if (cr>er||cc>ec) {
			return 0;
		}
		
		int count=0;
		for(int i=1;i<=er;i++) {
		count+= mazepath1(cr,cc+i,er,ec,ans+'V'+i);}
		for(int i=1;i<=ec;i++) {
		count+= mazepath1(cr+i,cc,er,ec,ans+'H'+i);}
		for(int i=1;i<=ec&&i<=er;i++) {
		count+= mazepath1(cr+i,cc+i,er,ec,ans+'D'+i);}
		return count;
	}
	
	public static int mazepath2(int cr,int cc,int er,int ec,String ans)
	{
		if (cr==er&&cc==ec) {
			//System.out.print(ans+" ");
			return 1;
		}
		
		if (cr>er||cc>ec) {
			return 0;
		}
		
		int count=0;
		count+= mazepath2(cr,cc+1,er,ec,'H'+ans);
		count+= mazepath2(cr+1,cc,er,ec,'V'+ans);
		return count;
	}


}
