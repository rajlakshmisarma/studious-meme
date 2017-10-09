package programs;

public class PrintArrayinReverse {

	/* function to print the iven array in reverse order */
	public void reverse(int arr[])
	{
		int len = arr.length-1;
		for (int i=len; i>=0; i--)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {

		PrintArrayinReverse obj = new PrintArrayinReverse();
		int[] array  = {-2, 7, 0, 4, 9, 15, 10, 13, -5, -3, 6};
		System.out.println("The array in reverse:");
		obj.reverse(array);

	}

}
