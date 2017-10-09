package programs;

public class MaxMinelements {

	/*function to find maximum element in the given array */
	public int findmax(int arr[]) 
	{
		int max=Integer.MIN_VALUE;
		int len = arr.length;
		for(int i=0; i<len; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;		
	}
	
	/*function to find minimum element in the given array */
	public int findmin(int arr[])
	{
		int min = Integer.MAX_VALUE;
		int len = arr.length;
		for(int i=0; i<len; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
	
		MaxMinelements obj = new MaxMinelements();
		int[] array  = {-2, 7, 0, 4, 9, 15, 10, 13, -5, -3, 6};
	System.out.println("The max element in the array is " + obj.findmax(array));
	System.out.println("The min element in the array is " + obj.findmin(array));
	}

}
