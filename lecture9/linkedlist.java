package lecture9;

public class linkedlist {
	private class node {
		int data;
		node next;
	}

	private int size;
	private node head;
	private node tail;

	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("LL is empty");
		else
			return this.head.data;

	}

	public int getlast() throws Exception {
		if (this.size == 0)
			throw new Exception("LL is empty");

		else
			return this.tail.data;
	}

	public int getAt(int idx) throws Exception {
		if (idx < 0 || idx >= this.size)
			throw new Exception("Invalid index");
		
			node temp = this.head;
			for (int i = 1; i <= idx; i++) {
				temp = temp.next;
			}
			return (temp.data);
		

	}

	public void addlast(int item) {
		// create
		node nn = new node();
		nn.data = item;
		nn.next = null;

		// link
		if (this.size >= 1) {
			this.tail.next = nn;

		}

		// update
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size += 1;
		} else {
			this.tail = nn;
			this.size += 1;

		}
	}

	public void display() {
		node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	//	System.out.println();
	}

	private node getNodeAt(int idx) throws Exception {
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid index");
		}
		
			node temp = this.head;
			for (int i = 1; i <= idx; i++) {
				temp = temp.next;
		}
			return temp;
	}

	public void addFirst(int item) {
		// create
		node nn = new node();
		nn.data = item;
		nn.next = null;
		// link
		if(this.size>=1) {
		nn.next = this.head;}
		// update
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size += 1;
		} else {
			this.head = nn;
			this.size += 1;

		}
	}

	public void addAt(int item, int idex) throws Exception {
		if (size == 0)
			addFirst(item);
		else if (size == 1)
			addlast(item);
		else {
			node nn = new node();
			nn.data = item;
			nn.next = null;
			node nm1 = getNodeAt(idex - 1);
			node np2 = nm1.next;
			nm1.next = nn;
			nn.next = np2;
			size++;
		}

	}

	public int removeFirst() throws Exception {
		node temp = this.head;
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}

		else if (this.size == 1) {
			this.head = null;
			this.tail = null;
			size = 0;
		} else {
			this.head = this.head.next;
			size--;
		}

		return temp.data;
	}

	public int removeLast() throws Exception {
		node temp = this.tail;
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}

		else if (this.size == 1) {
			this.head = null;
			this.tail = null;
			size = 0;
		} else {
			node nm1 = getNodeAt(this.size - 2);
			nm1.next = null;
			this.tail = nm1;
			size--;
		}

		return temp.data;

	}

	public int removeAt(int i) throws Exception {
		if (this.size == 0)
			throw new Exception("LL is empty");
		if (i < 0 || i >= this.size)
			throw new Exception("Invalid index");

		if (i == 0) {
			 return removeFirst();
		}
		else if (i == this.size - 1) {
			return removeLast();
		}
		else {
			
			node nm1 = getNodeAt(i - 1);
			node nn = nm1.next;
			node np1 = nn.next;
			
			nm1.next = np1;
			size--;
			
			return nn.data;
		}
		
	}

	public void reverseDataIteratively() throws Exception {
		for (int i = 0; i < this.size / 2; i++) {
			node n1 = this.getNodeAt(i);
			node n2 = this.getNodeAt(this.size - 1 - i);
			int temp = n1.data;
			n1.data = n2.data;
			n2.data = temp;
		}

		display();
	}

	public void rpointeriteratively() {
		node prev = this.head;
		node curr = head.next;

		while (curr != null) {
			node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

		tail.next = null;
		display();
	}

	public void rpointerrecursion() {
		rpointerrecursion(this.head, this.head.next);
		node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

		tail.next = null;

	}

	private void rpointerrecursion(node prev, node curr) {
		if (curr == null) {
			return;
		}

		rpointerrecursion(curr, curr.next);
		curr.next = prev;
	}

	public void rdatarecursionr() {
		rdatarecursionr(this.head, this.head, 0);
	}

	private node rdatarecursionr(node left, node right, int count) {
		if (right == null) {
			return left;
		}

		left = rdatarecursionr(left, right.next, count + 1);

		if (count >= this.size / 2) {
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
		}

		return left.next;
	}

	public void rdatarecursion() {
		heapmover mover = new heapmover();
		mover.left = this.head;
		rdatarecursion(mover, this.head, 0);
	}

	private class heapmover {
		node left;
	}

	private void rdatarecursion(heapmover mover, node right, int count) {
		if (right == null) {
			return;
		}

		rdatarecursion(mover, right.next, count + 1);
		if (count >= this.size / 2) {
			int temp = mover.left.data;
			mover.left.data = right.data;
			right.data = temp;

		}
		mover.left = mover.left.next;
	}

	public void fold() {
		heapmover mover = new heapmover();
		mover.left = this.head;
		fold(mover, this.head, 0);
	}

	private void fold(heapmover mover, node right, int count) {
		if (right == null) {
			return;
		}

		fold(mover, right.next, count + 1);
		if (count > this.size / 2) {
			node temp = mover.left.next;
			mover.left.next = right;
			right.next = temp;
			mover.left = temp;
		}

		if (count == size / 2) {
			this.tail = right;
			this.tail.next = null;
		}

	}

	public int mid() {
		node slow = this.head;
		node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow.data;
	}

	private node midnode() {
		node slow = this.head;
		node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}
	
	public boolean palindrome() throws Exception
	{
		int i=0,j=this.size-1;
		while(i!=this.size/2)
		{
			node n1=this.getNodeAt(i);
			node n2=this.getNodeAt(j);
			
			if(n1.data!=n2.data)
				return false;
			
			i++;
			j--;
		}
		return true;
	}
	
	public void oddeven() throws Exception
	{
		linkedlist even=new linkedlist();
		node current=null;
		for(int i=0;i<this.size;i++)
		{
			current=this.getNodeAt(i);
			if(current.data%2==0)
			{
				int item=current.data;
				this.removeAt(i);
				even.addlast(item);
			}
		}
		this.display();
		even.display();
	}

	public int kthfromLast(int k) {
		node slow = this.head;
		node fast = this.head;

		for (int i = 1; i <= k; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow.data;
	}
	
	public void swap(int num1,int num2) throws Exception
	{
		node n1=null ,n2=null;
		for(int i=0;i<this.size;i++)
		{
			if(num1==this.getAt(i))
			{
				 n1 = this.getNodeAt(i);
			}
			if(num2==this.getAt(i))
			{
				 n2= this.getNodeAt(i);

			}
		}
		
		int temp = n1.data;
		n1.data = n2.data;
		n2.data = temp;
		
		
	}
	
	public void duplicates() throws Exception
	{
		node n=this.head;
		if(this.head==null)
		{
			return;
		}
		while(n.next!=null)
		{
			if(n.data==n.next.data)
			{  
				node temp=n.next.next;
				n.next=null;
				n.next=temp;
			}
			else {
				n=n.next;
			}
		}
	}


	public void kReverse(int k) throws Exception {
		linkedlist prev = null;

		while (this.size != 0) {
			linkedlist curr = new linkedlist();

			for (int i = 1; i <= k; i++) {
				curr.addFirst(this.removeFirst());
			}

			if (prev == null) {
				prev = curr;
			} else {
				prev.tail.next = curr.head;
				prev.tail = curr.tail;
				prev.size += curr.size;
			}
		}
		this.head = prev.head;
		this.tail = prev.tail;
		this.size = prev.size;
		display();
	}

	private linkedlist merging(linkedlist other) {
		node temp1 = this.head;
		node temp2 = other.head;

		linkedlist merged = new linkedlist();

		while (temp1!=null && temp2!=null) {
			if (temp1.data < temp2.data) {
				merged.addlast(temp1.data);
				temp1 = temp1.next;
			} else {
				merged.addlast(temp2.data);
				temp2 = temp2.next;
			}
		}


			while (temp2 != null) {
				merged.addlast(temp2.data);
				temp2 = temp2.next;
			}
		

			while (temp1 != null) {
				merged.addlast(temp1.data);
				temp1 = temp1.next;
			}
		

		return merged;
	}

	public void sorted() {
		if (this.size == 1) {
			return;
		}
		node mid = this.midnode();
		node midn = mid.next;

		linkedlist fh = new linkedlist();
		fh.head = this.head;
		fh.tail = mid;
		fh.tail.next = null;
		fh.size = (this.size + 1) / 2;

		linkedlist sh = new linkedlist();
		sh.head = midn;
		sh.tail = this.tail;
		sh.size = this.size / 2;

		fh.sorted();
		sh.sorted();

		linkedlist merged = fh.merging(sh);

		this.head=merged.head;
		this.tail=merged.tail;
		this.size=merged.size;

	}
	
	public void kthappend(int k) throws Exception
	{
		node last= this.getNodeAt(this.size-1-k);
	    node temp=last.next;
	    tail.next=this.head;
		
		tail=last;
		this.head=temp;
	
		this.display();
	}
	

}
