package programs;

public class LoopinLinkedList {

	//Node class
	public class Node
	{
		int data;
		Node next;
		//Node constructor
		Node(int data)	{
			this.data = data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public int getData() {
			return data;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Node getNext() {
			return next;
		}
	}
	
	private Node head;
		
	//Detect a Loop in a single linked list and find the start node of the loop
	public Node detectLoopAndStartNode()
	{
		Node slowptr = head; //slow and fast pointers initially at starting position
		Node fastptr = head;
			
		while(fastptr!=null && fastptr.getNext()!=null) //If NULL is detected in this case, that means there is no cycle in the linked list
		{
			slowptr = slowptr.getNext(); //move slow pointer one node at a time
			fastptr = fastptr.getNext().getNext(); //move fast pointer two nodes at a time (twice the speed of slow pointer)
			
			if(slowptr==fastptr) //if both pointers are meeting at some node, that means cycle is present
			{
				slowptr = head; //to detect the start of the loop, at this point, move the slow pointer to the start of the linked list and keep the fast pointer in the same position
				while(slowptr!=fastptr)
				{
					slowptr = slowptr.getNext(); //move both the pointers one node at a time till they meet
					fastptr = fastptr.getNext(); /* This is done because distance from head to start node of loop = distance from meeting point of the 2 pointers to the start of loop*/
				}
				return slowptr; //finally return the start node of the loop
			}
		}
		return null; //if no cycle detected, return null
	}
	
	public static void main(String[] args) {
		LoopinLinkedList obj = new LoopinLinkedList();
		Node n1 = obj.new Node(10);
		Node n2 = obj.new Node(20);
		Node n3 = obj.new Node(30);
		Node n4 = obj.new Node(40);
		Node n5 = obj.new Node(50);
		Node n6 = obj.new Node(60);
		Node n7 = obj.new Node(70);
		obj.head = n1;
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n3); //cycle formed here
		
		Node loopNode = obj.detectLoopAndStartNode();
		   
		  if(loopNode==null){
		   System.out.println("Loop not present");
		  }else{
			  System.out.println("Loop detected in the linked list");
		   System.out.println("Start node of the Loop is :"+ loopNode.getData()); 
		  }		
	}
}
