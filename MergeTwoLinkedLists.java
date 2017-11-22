package programs;

public class MergeTwoLinkedLists {

	//Node class
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
		
		//function to add nodes to the end of the linked list
		public void addNodeAtEnd(Node node)
		{
			//Node head = null;
			Node temp = node;
				while(temp.getNext()!=null)
				{
					temp.setNext(node);
					temp = temp.getNext();				
				}		
		}
		
		//Function to merge the 2 sorted linked lists into a single linked list
	public Node mergelinkedlists(Node currentnode1, Node currentnode2)
	{
		if(currentnode1==null) return currentnode2;
		if(currentnode2==null) return currentnode1;
		Node mergedlisthead = null;
		Node temp;
		
			if(currentnode1.getData() < currentnode2.getData())
			{
				mergedlisthead = currentnode1;
				addNodeAtEnd(currentnode1);
				currentnode1 = currentnode1.getNext();
			}
			else if(currentnode1.getData() > currentnode2.getData())
			{
				mergedlisthead = currentnode2;
				addNodeAtEnd(currentnode2);
				currentnode2 = currentnode2.getNext();
			}
			temp = mergedlisthead;
			while(currentnode1.getNext()!=null && currentnode2.getNext()!=null)
			{
				if(currentnode1.getData() < currentnode2.getData())
				{
					addNodeAtEnd(currentnode1);
					currentnode1 = currentnode1.getNext();
				}
				else if(currentnode1.getData() > currentnode2.getData())
				{
					addNodeAtEnd(currentnode2);
					currentnode2 = currentnode2.getNext();
				}
				temp = temp.getNext();
			}
			while(currentnode1!=null)
			{
				addNodeAtEnd(currentnode1);
			}
			while(currentnode2!=null)
			{
				addNodeAtEnd(currentnode2);
			}
		return temp;
	}
	public static void main(String[] args) {
		MergeTwoLinkedLists obj = new MergeTwoLinkedLists();
		Node list1node1 = obj.new Node(5);
		Node list1node2 = obj.new Node(10);
		Node list1node3 = obj.new Node(15);
		Node list1node4 = obj.new Node(22);
		Node list2node1 = obj.new Node(2);
		Node list2node2 = obj.new Node(3);
		Node list2node3 = obj.new Node(20);
		Node head1 = list1node1;
		Node head2 = list2node2;
		list1node1.setNext(list1node2);
		list1node2.setNext(list1node3);
		list1node3.setNext(list1node4);
		list2node1.setNext(list2node2);
		list2node2.setNext(list2node3);
		
		Node mergedhead = obj.mergelinkedlists(head1, head2);
		obj.printlinkedlist(mergedhead);
	}

}
