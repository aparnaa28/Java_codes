package lecture9;

public class queueusingstacks {

	public DynamicStack stack= new DynamicStack();
	
	 public int dequeue() throws Exception
	 {
		 try
		 {
			int item= stack.pop();
			return item;
		 }
		 catch(Exception e)
		 {
			 throw new Exception("queue is empty");
		 }
	 }
	 
	 public void enqueue(int item) throws Exception
	 {
		 DynamicStack helper= new DynamicStack();
		 
		 try
		 { 
			 while(!stack.isEmpty())
			 {
				 int temp=stack.pop();
				 helper.push(temp);
			 }
			 
			 stack.push(item);
			 while(!helper.isEmpty())
			 {
				 int temp=helper.pop();
				 stack.push(temp);
			 }
			 
			 helper=stack;
		 }
		 catch(Exception e)
		 {
			 throw new Exception (" queue is full");
		 }
		 
	 }
	 
	 public int size()
	 {
	 	return this.stack.size();
	 }

	 public boolean isEmpty()
	 {
	   return this.stack.size()==0;
	 }
	 
	 public int getfront() throws Exception
	 {
		 try
		 {
		   int item=stack.pop();
		   return item;
		 }
		 
		 catch(Exception e)
		 {
			 throw new Exception(" Queue is empty");
		 }
	 }
	 
	 public void display()
	 {
		 stack.display();
	 }
	 
	 
}
