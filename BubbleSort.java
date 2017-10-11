package programs;

public class BubbleSort {

	/* Bubble Sort Time complexity - O(n^2) */
	public void bubblesort(int[] array)
	{
		int len = array.length;
		int temp;
		for (int i=0; i<len; i++)
		{
			for (int j=i+1; j<len; j++)
			{
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Sorted array is: ");
		for(int i=0; i<len; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		int[] array = {45, 60, 21, 74, 35, 52, 19, 68, 49};
		int len = array.length;
		System.out.println("Given array is:");
		for(int i=0; i<len; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		obj.bubblesort(array);

	}
}
