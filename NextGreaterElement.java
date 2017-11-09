package programs;

public class NextGreaterElement {
	/**
	 * Program to return an array containing the next greater element for each array element on its right side
	 */
	
	// Stack class with functions for push, pop
	public class stack{
		int top=-1;
		int maxsize = 100;
		int[] stack = new int[maxsize];
		public void push(int element) //push elements to the Stack by incrementing the top
		{
			if(top==maxsize)
			{
				System.out.println("stack full");
			}
			else
			{
				stack[++top] = element;
			}
		}
		public int pop() //pop elements from the Stack by decrementing top in Last-in-first-out order
		{
			int poppedElement=0;
			if(top==-1)
			{
				System.out.println("stack empty");
				return -1;
			}
			else
			{
				poppedElement = stack[top];
				top--;
				return poppedElement;
			}		
		}
		public boolean isEmpty() //check for the stack empty condition
		{
			if(top==-1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
	//Function to find and print the next greater element using brute force method
	//Time complexity - O(n^2)
	public void ngeUsingBruteForce(int[] array)
	{
		int len = array.length;
		int[] newarray = new int[len];
		int nextgreater = Integer.MIN_VALUE;
		for(int i=0; i<len; i++)
		{		
			for(int j=i+1; j<len; j++)
			{
				if(array[i]<array[j])
				{
					nextgreater = array[j];
					newarray[i] = nextgreater;
					break;
				}
			}		
		}
		System.out.println("Array containing the next greater element for every array element (using brute force method): ");
		for(int i=0; i<len; i++)
		{
			System.out.print(array[i] + " ------> " + newarray[i]);
			System.out.println();
		}
	}
	
	//Function to find and print the next greater element using stack class
	//Time complexity - O(n)
	public void ngeUsingStack(int[] array)
	{
		int len = array.length;
		stack st = new stack();
		st.top=-1;
		int nextgreater, element;
		System.out.println("Array containing the next greater element for every array element (using a stack): ");
		st.push(array[0]); //push the first element into the stack
		for(int i=1; i<len; i++) //iterate over rest of elements
		{
			nextgreater = array[i]; //mark current elements as next
			if(st.isEmpty()==false)
			{
				element = st.pop(); //if the stack is not empty, pop an element from the stack
				while(element < nextgreater) //if the popped element is less than the next greater:  
				{
					System.out.println(element + " ------> " + nextgreater); //1) print both the element and the next greater one
                    if (st.isEmpty() == true) // 2) keep popping till elements are less than next greater and stack is not empty 
                        break;
                    element = st.pop();
				}
				if(element > nextgreater) //if the popped element is greater than next greater then push it back to stack
				{
					st.push(element);
				}
			}
			st.push(nextgreater); //push the next greater to the stack and the process repeats			
		}
		while(st.isEmpty()==false) //for the remaining elements which do not have the next greater element, print 0 for them
		{
			element = st.pop();
			nextgreater = 0;
			System.out.println(element + " ------> " + nextgreater);
		}
	}
	public static void main(String[] args) {
		NextGreaterElement obj = new NextGreaterElement();
		int[] array = {11,13,21,3};
		int len = array.length;
		System.out.println("Given array:");
		for(int i=0; i<len; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		obj.ngeUsingBruteForce(array); //function for brute force method to find NGE
		obj.ngeUsingStack(array); //function call for stack method to find NGE
	}
}
