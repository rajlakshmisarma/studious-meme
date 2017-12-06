package programs;
public class MergeTwoLinkedLists {
	//Node class
	public class Node{  
		 private int data;
		 private Node next;
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
			
		//Function to merge the 2 sorted linked lists into a single linked list
	public Node mergelinkedlists(Node currentnode1, Node currentnode2)
	{		
		Node mergedlist= null;
		Node temp;
		if(currentnode1==null) return currentnode2;
		if(currentnode2==null) return currentnode1;
		
			if(currentnode1.getData() < currentnode2.getData())  //the very first addition of a node to the merged list after compare
			{
				mergedlist = currentnode1;
				currentnode1 = currentnode1.getNext();
			}
			else if(currentnode1.getData() > currentnode2.getData())
			{
				mergedlist = currentnode2;
				currentnode2 = currentnode2.getNext();
			}
			temp = mergedlist;   //keep track of the head of the merged list
			while(currentnode1!=null && currentnode2!=null)   //after the first addition, iterate over both the lists and add to the merged list after compare
			{
				if(currentnode1.getData() < currentnode2.getData())
				{
					mergedlist.setNext(currentnode1);
					currentnode1 = currentnode1.getNext();
				}
				else if(currentnode1.getData() > currentnode2.getData())
				{
					mergedlist.setNext(currentnode2);
					currentnode2 = currentnode2.getNext();
				}
				mergedlist = mergedlist.getNext();
			}
			if(currentnode1!=null)  //if any remaining nodes in list1, just keep adding to the merged list
			{
				mergedlist.setNext(currentnode1);
			}
			if(currentnode2!=null)  //if any remaining nodes in list2, just keep adding to the merged list
			{
				mergedlist.setNext(currentnode2);
			}
			return temp;  //return head of the merged list
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
		Node head2 = list2node1;
		list1node1.setNext(list1node2);
		list1node2.setNext(list1node3);
		list1node3.setNext(list1node4);
		list2node1.setNext(list2node2);
		list2node2.setNext(list2node3);
		
		System.out.println("First sorted linked list: ");
		obj.printlinkedlist(head1);
		System.out.println();
		System.out.println("Second sorted linked list: ");
		obj.printlinkedlist(head2);
		System.out.println();
		Node mergedhead = obj.mergelinkedlists(head1, head2);
		System.out.println("Merged linked list:" );
		obj.printlinkedlist(mergedhead);
	}
}
