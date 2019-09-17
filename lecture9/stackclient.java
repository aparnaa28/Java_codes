package lecture9;

public class stackclient {
	public static void main(String[] args) throws Exception {
		stack s= new stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.display();
		System.out.println(s.peek());
		System.out.println("----------------");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());	
	   
	}
	
	
}
