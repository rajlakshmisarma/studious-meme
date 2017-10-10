package programs;

public class PrintArrayinReverse {

	/* function to print the given array in reverse order */
	public void reverse(int arr[])
	{
		int[] reversedarray = new int[arr.length];
		int startindex=arr.length-1;
		int len = reversedarray.length;
		for (int i=0; i<len; i++)
		{
			reversedarray[i] = arr[startindex];
			startindex--;
		}
		for(int i=0; i<len; i++)
		{
			System.out.print(reversedarray[i] + " ");
		}
	}
	
	public static void main(String[] args) {

		PrintArrayinReverse obj = new PrintArrayinReverse();
		int[] array  = {-2, 7, 0, 4, 9, 15, 10, 13, -5, -3, 6};
		int length = array.length;
		System.out.println("Original array:");
		for(int i=0; i<length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Reversed Array:");
		obj.reverse(array);

	}
}
