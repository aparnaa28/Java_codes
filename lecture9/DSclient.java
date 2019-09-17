package lecture9;

import java.util.Scanner;

public class DSclient {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// stack S = new DynamicStack();
		// S.push(70);
		// S.display();
		// displayReverse(S);
		// stack helper= new DynamicStack();
		// actualReverse(S,helper);
		// S.display();
		System.out.println("Enter the size");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		//System.out.println(histogram(arr));
		nextGreaterElement(arr);
//		int []stock=stockSpan(arr);
//		for(int i=0;i<stock.length;i++)
//		{
//			System.out.print(stock[i]+" ");
//		}
//		System.out.println("END ");
	}

	public static void displayReverse(stack s) throws Exception {
		if (s.size() == 0) {
			return;
		}
		int val = s.pop();
		displayReverse(s);
		System.out.println(val);
		s.push(val);

	}

	public static void actualReverse(stack s, stack helper) throws Exception {
		if (s.size() == 0) {
			if (helper.isEmpty()) {
				return;
			}
			int val1 = helper.pop();
			actualReverse(s, helper);
			s.push(val1);
			return;
		}

		int val = s.pop();
		helper.push(val);
		actualReverse(s, helper);
		System.out.println(val);

	}

	public static void nextGreaterElement(int[] arr) throws Exception {
		stack s = new DynamicStack();
		s.push(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if ( !s.isEmpty() && arr[i] <= s.peek()) {
				s.push(arr[i]);
			} else {
				while (!s.isEmpty() && arr[i] > s.peek()) {
					System.out.println(s.peek() + "-> " + arr[i]);
					s.pop();
				}
				
				s.push(arr[i]);
			}
		}

		if (s.size() != 0) {
			while (!s.isEmpty()) {
				System.out.println(s.pop() + "-> -1");
			}
		}

	}
	
 public static int[] stockSpan(int[] prices) throws Exception
	{
		int []span = new int[prices.length];
		stack s = new DynamicStack();
		
		for(int i=0;i<prices.length;i++)
		{
			while(!s.isEmpty()&&prices[i]>prices[s.peek()])
			{
				s.pop();
			}
			if(s.size()==0)
			{
				span[i]=i+1;
			}
			else
			{
				span[i]=i-s.peek();
			}
			s.push(i);
		}
		
		return span;
	}
 
 public static int histogram(int arr[]) throws Exception
 {
	 int area=0,maxa=0,i=0;
	 stack s=new DynamicStack();
	 while (i < arr.length)
     {
         if (s.isEmpty() || arr[s.peek()] <= arr[i])
             s.push(i++);
   
         else
         {
             int val = s.peek();
             s.pop(); 
             if(s.isEmpty())
    		 {
    			 area=arr[val]*(i);
    		 }
    		 else
    		 {
    			 area=arr[val]*(i-s.peek()-1);
    		 }
   
             if (maxa < area)
                 maxa=area;
         }
     }
	 while (s.isEmpty() == false)
     {
        int tp = s.peek();
         s.pop();
         if(s.isEmpty())
		 {
			 area=arr[tp]*(i);
		 }
		 else
		 {
			 area=arr[tp]*(i-s.peek()-1);
		 }
   
         if (maxa < area)
             maxa=area;
     }
	 
	 return maxa;
 }

}
