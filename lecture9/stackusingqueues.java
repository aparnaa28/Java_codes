package lecture9;

public class stackusingqueues {

	private Dynamicqueue pqueue= new Dynamicqueue();
	 public void push(int item) throws Exception
	 {
		 try
		 {
			 pqueue.enqueue(item);
		 }
		 catch(Exception e)
		 {
			 throw new Exception(" Stack is full");
		 }
	 }
	 
	 public void push2(int item) throws Exception
	 {
		 Dynamicqueue helper= new Dynamicqueue();
		 try
		 {
			 helper.enqueue(item);
			 while(!pqueue.isempty())
			 {
				 int temp= pqueue.dequeue();
				 helper.enqueue(temp);
			 }
			 
			 pqueue=helper;
		 }
		 
		 catch(Exception e)
		 {
			 throw new Exception(" Stack is full");
		 }
		 
	 }
	 
	 public int pop() throws Exception
	 {
		 try {
		  Dynamicqueue helper= new Dynamicqueue();
		 
		  while(pqueue.size!=1)
		  {
			  int temp= pqueue.dequeue();
			  helper.enqueue(temp);
		  } 
		  int rv= pqueue.dequeue();
		  return rv;
		 }
		 catch(Exception e)
		 {
			throw new Exception(" Stack is empty"); 
		 }
	 }
	 
	 public int pop2() throws Exception
	 {
		 try
		 {
			int item= pqueue.dequeue();
			return item;
		 }
		 catch(Exception e)
		 {
			 throw new Exception("Stack is empty");
		 }
	 }
	 
	 public int top() throws Exception
	 {
		 try {
		  Dynamicqueue helper= new Dynamicqueue();
		 
		  while(pqueue.size!=1)
		  {
			  int temp= pqueue.dequeue();
			  helper.enqueue(temp);
		  }
		  
		  int rv= pqueue.dequeue();
		  helper.enqueue(rv);
		  return rv;
		 }
		  
		  catch(Exception e)
			 {
				throw new Exception(" Stack is empty"); 
			 }
	 }
	 
	 public int top2() throws Exception
	 {
		 try
		 {
			int item= pqueue.getFront();
			return item;
		 }
		 catch(Exception e)
		 {
			 throw new Exception("Stack is empty");
		 }
	 }
	 
	 public int size()
	 {
		 return this.pqueue.size();
	 }
	 
	 public boolean isEmpty()
	 {
		 return pqueue.size()==0;
			
	 }
	 
	 public void display() throws Exception
	 {
		// display(0);
		 pqueue.display();
	 }
	 
	 private void display(int count) throws Exception
		{
			if(count==pqueue.size)
			{
				return;
			}
			
			int val=pqueue.dequeue();
			pqueue.enqueue(val);
			display(count+1);
			System.out.println(val);
		}

}
