//LNode.java
package llist;

public class LNode {

	private int val;
	private LNode next;
	private LNode prev;

	public LNode(LNode p, int v, LNode n){
		val = v;
		next = n;
		prev = p;
	}

	public int getVal(){
		return val;
	}

	public LNode getNext(){
		return next;
	}
	
	public LNode getPrev(){
		return prev;
	}
	
	public void setNext(LNode n){
		next = n;
	}
	
	public void setPrev(LNode p){
		prev = p;
	}
	
	public void swap(){
		LNode tmp = next;
		next = prev;
		prev = tmp;
	}

	public String toString(){
		return "" + val;
	}

}