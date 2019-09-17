package lecture9;

import java.util.Scanner;

public class stack {

int []data;
int tos;
public stack()
{
	this.data = new int [5];
	 this.tos=-1;
}

public stack(int cap)
{
	this.data = new int [cap];
	 this.tos=-1;
}

public int size()
{
	return this.tos+ 1;
}

public boolean isEmpty()
{
  return this.size() == 0;
}

public void push(int item) throws Exception
{ 			if (this.size() == this.data.length) {
	throw new Exception("Stack full");
}
  tos++;
  data[this.tos]= item;

}

public int pop() throws Exception
{
	if(this.tos==-1)
		throw new Exception("Empty stack");
	
	int rv= data[this.tos];
	data[this.tos]=0;
	tos--;
	return rv;
}

public int peek() throws Exception
{
	if(this.tos==-1)
		throw new Exception("Empty stack");
	
	return  this.data[this.tos];
	
}

public void display()
{
	for(int i=tos;i>=0;i--)
	{
		System.out.print(data[i]+" ");
	}
}


}
