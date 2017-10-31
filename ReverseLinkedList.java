package programs;

public class ReverseLinkedList {

	private Node head;
	//Definition of Node class
	public class Node{
		  
		 private int data;
		 private Node next;
		 //Node constructor 
		 public Node(int data) {
		  this.data = data;
		 }
		 //getters and setters
		 public int getData() {
		  return data;
		 }
		 public void setData(int data) {
		  this.data = data;
		 }
		 public Node getNext() {
		  return next;
		 }
		 public void setNext(Node next) {	
		  this.next = next;
		 }
	}
	
	
	//function to reverse the linked list
	public Node reverselinkedlist()
	{
		Node prev = null;
		Node current = head;
		Node next = null;
		while(current != null)
		{
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		return prev;
	}
	
	//function to print the linked list
	public void printlinkedlist(Node node)
	{	
		while(node!=null)
		{
			System.out.print(node.getData() + "--->");
			node = node.getNext();
		}
		System.out.print("null");
	}
	
	//function to add nodes to the linked list
	public void addNodeAtEnd(Node node)
	{
		if(head==null)
		{
			head=node;
		}
		else{
			Node temp = head;
			while(temp.getNext()!=null)
			{
				temp = temp.getNext();
				temp.setNext(node);
			}
		}
	}
	public static void main(String[] args) {
		ReverseLinkedList obj = new ReverseLinkedList();
		Node n1 = obj.new Node(10);
		Node n2 = obj.new Node(20);
		Node n3 = obj.new Node(30);
		Node n4 = obj.new Node(40);
		Node n5 = obj.new Node(50);
		Node n6 = obj.new Node(60);
		obj.head = n1;
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		
		System.out.println("Original linked list:");
		obj.printlinkedlist(obj.head);
		System.out.println();		
		System.out.println("Reversed Linked list:");
		Node reversednode = obj.reverselinkedlist();
		obj.printlinkedlist(reversednode);
	}
}
