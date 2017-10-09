package programs;

public class SecondMaxMinelements {

	/* function to find second maximum elemnet in the given array */
	public int secondmax(int arr[])
	{
		int max1, max2;
		max1 = max2 = Integer.MIN_VALUE;
		int len = arr.length;
		for(int i=0; i<len; i++)
		{
			if(arr[i]>max1)
			{
				max2=max1; 
				max1=arr[i];
			}
			else if(arr[i]>max2)
			{
				max2=arr[i];
			}
		}
		return max2;
	}
	
	/* function to find second minimum element in the given array */
	public int secondmin(int arr[])
	{
		int min1, min2;
		min1 = min2 = Integer.MAX_VALUE;
		int len = arr.length;
		for(int i=0; i<len; i++)
		{
			if(arr[i]<min1)
			{
				min2= min1;
				min1=arr[i];
			}
			else if(arr[i]<min2)
			{
				min2=arr[i];
			}
		}
		return min2;
	}
	
	public static void main(String[] args) {
		SecondMaxMinelements obj = new SecondMaxMinelements();
		int[] array = {-2, 7, 0, 4, 9, 15, 10, 13, -5, -3, 6};
		System.out.println("The second max element in the array is " + obj.secondmax(array));
		System.out.println("The second min element in the array is " + obj.secondmin(array));
	}

}
