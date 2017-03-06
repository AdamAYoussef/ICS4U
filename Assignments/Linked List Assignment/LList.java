//Adam Youssef
/*This program is a Linked List class that 
has functions that can be used to modify a Linked List
*/ 

class LList {
	private LNode head;
	private LNode tail;
	
	public LList(){
		head = null;
		tail = null;
	}
	
	/*public void add(int n){
		LNode tmp = new LNode(p, n, head);
		head = tmp;
	}*/
	
	//add an element to the front of the list
	public void push(int n) {
		LNode tmp = new LNode(null, n, head);

		if (head == null){
			tail = tmp;
		}	
		else{
			head.setPrev(tmp);
		}
		head = tmp;
	}
	
	//remove and return element from front of list
	public LNode pop(){
		LNode tmp = head;
		
		if(tmp == null){
			return tmp;
		}
		
		head = tmp.getNext();
		
		if(head == null){
			tail = null;
		}
		else{
			head.setPrev(null);
		}
		
		return tmp;
		
	}
	
	public void enqueue(int n){
		LNode tmp = new LNode(tail, n, null);
		
		if(tail == null){
			head = tmp;
		}
		else{
			tail.setNext(tmp);
		}
		
		tail = tmp;
	}
	
	public LNode dequeue(){
		LNode tmp = tail;
		
		if(tmp == null){
			return tmp;
		}
		
		tail = tmp.getPrev();
		
		if(tail == null){
			head = null;
		}
		else{
			tail.setNext(null);
		}
		
		return tmp;
	}
	
	// Remove specified node from list
	public void delete(LNode n) {
		if (n == null)
			return;

		LNode prev = n.getPrev();
		LNode next = n.getNext();

		// only one node in list
		if (next == null && prev == null) {
			next = null;
			prev = null;

			return;
		}
		// delete tail
		else if (next == null) {
			tail = prev;
			prev.setNext(null);

			return;
		}
		// delete head
		else if (prev == null) {
			head = next;
			next.setPrev(null);

			return;
		}

		prev.setNext(next);
		next.setPrev(prev);
	}
	
	// Remove first node with specified value from list
	public void delete(int n) {
		LNode tmp = head;
		while (tmp != null && tmp.getVal() != n) {
			tmp = tmp.getNext();
		}

		delete(tmp);
	}
	
	// Remove node at specified location from list
	public void deleteAt(int n) {
		LNode tmp = head;

		try {
			for (int i = 0; i < n; i++) {
				tmp = tmp.getNext();
			}
		}
		catch (NullPointerException e) {
			System.out.println("Index out of range");
		}

		delete(tmp);
	}
	
	// Add new node into correct position in list assuming it is sorted
	public void sortedInsert(int n) {
		LNode tmp = new LNode(null, n, null);

		// empty list
		if (head == null) {
			head = tmp;
			tail = tmp;

			return;
		}

		LNode c = head;
		while (c.getNext() != null && c.getVal() > n) {
			c = c.getNext();
		}

		// insert at tail
		if (c.getNext() == null && c.getVal() > n) {
			c.setNext(tmp);
			tmp.setPrev(c);

			tail = tmp;

			return;
		}

		// insert at head
		LNode prev = c.getPrev();
		if (prev == null) {
			head = tmp;
			tmp.setNext(c);
			c.setPrev(tmp);

			return;
		}

		tmp.setNext(c);
		tmp.setPrev(prev);
		c.setPrev(tmp);
		prev.setNext(tmp);
	}
	
	// Remove multiple occurances of nodes from list
	public void removeDuplicates() {
		LNode tmp = head.getNext();
		LNode rmv = head;

		while (rmv.getNext() != null) {
			if (tmp.getVal() == rmv.getVal()) {
				LNode toDelete = tmp;
				tmp = tmp.getPrev();
				delete(toDelete);
			}
			if (tmp.getNext() == null) {
				rmv = rmv.getNext();
				tmp = rmv.getNext();
			}
			else {
				tmp = tmp.getNext();
			}
		}
	}
	
	// Change list to be in reverse order
	public void reverse() {
		LList rev = new LList();
		LNode tmp = head;
		while (tmp != null) {
			rev.push(pop().getVal());
			tmp = tmp.getNext();
		}
		head = rev.head;
		tail = rev.tail;
	}
	
	// Return copy of list
	public LList clone() {
		LList copy = new LList();
		LNode tmp = head;
		while (tmp != null) {
			copy.enqueue(tmp.getVal());
			tmp = tmp.getNext();
		}

		return copy;
	}
	
	public LNode getHead() {
		return head;
	}

	public LNode getTail() {
		return tail;
	}
	
	public String toString(){
		String ans = "";
		LNode tmp = head;
		while(tmp != null){
			ans += tmp + ",";
			tmp = tmp.getNext();
		}
		ans = ans.substring(0,ans.length()-1);
		return "[" + ans + "]";
	}
}