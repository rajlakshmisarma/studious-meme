package programs;

public class SelectionSort {

	/*Selection Sort time complexity - O(n^2) */
	public void selectionsort(int[] array)
	{
		int len = array.length;
		for(int i=0; i<len; i++)
		{
			int index=i; //initial index = starting position (i)
			for(int j=i+1; j<len; j++)
			{
				if(array[j]<array[index])
				{
					index = j; //index points now to the smallest element
				}
			}
			int temp = array[index]; //swap the smallest element with the i position
			array[index] = array[i];
			array[i] = temp;
		}
		System.out.println("Sorted array: ");
		for(int i=0; i<len; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
	public static void main(String[] args) {
		SelectionSort obj = new SelectionSort();
		int[] array = {45, 60, 21, 74, 35, 52, 19, 68, 49, 15};
		int len = array.length;
		System.out.println("Given array: ");
		for(int i=0; i<len; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		obj.selectionsort(array);

	}
}
