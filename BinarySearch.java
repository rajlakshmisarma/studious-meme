package programs;

public class BinarySearch {

	/* Binary search in sorted array */
	public void binarysearch(int[] array, int key)
	{
		int low=0;
		int high = array.length-1;		
		while(low <= high)
		{
			int mid = low + ((high-low)/2); //this is done because mid=(low+high)/2 may result in integer overflow for huge arrays
			if(key==array[mid])
			{
				System.out.println("Key " + key + " found at position: " + (mid+1));
				break;
			}
			else if(key < array[mid])
			{
				high = mid-1;
			}
			else if(key > array[mid])
			{
				low = mid+1;
			}
		}
		if(low>high)
		{
			System.out.println("Key " + key + " not found");
		}
	}
	
	public static void main(String[] args) {
		BinarySearch obj = new BinarySearch();
		int[] array = {10, 14, 16, 17, 20, 22, 25, 29, 31, 36, 38, 42};
		System.out.println("Given array:");
		int len = array.length;
		for(int i=0; i<len; i++) 
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		obj.binarysearch(array, 32);
	}
}
