package kr.ac.embedded.kookmin.Generic;

public class StackGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stackInteger = new Stack<Integer>();
		stackInteger.push(1);
		stackInteger.push(2);
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
		
		Stack<String> stackString = new Stack<String>();
		stackString.push("Kookmin University");
		stackString.push("Korea Seoul");
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
	}

}

class Stack<T> {
	Node<T> top;
	
	public T pop() {
		T data = top.getData();
		top = top.getNext();
		return data;
	}
	
	public void push(T item) {
		Node<T> n = new Node<T>(item);
		n.setNext(top);
		top = n;
	}
}

class Node<T> {
	Node<T> next;
	private T data;
	
	public Node(T d) {
		data = d;
	}
	
	public T getData() {
		return data;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public void setNext(Node<T> n) {
		next = n;
	}
}