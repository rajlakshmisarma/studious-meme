package programs;

import java.util.Arrays;

public class RemoveDuplicates {

	public void rmvdup(int arr[])
	{
		int[] originalarray = arr;
		int len = originalarray.length;
		System.out.println("original array with duplicates: ");
		for(int i=0; i<len; i++)
		{
			System.out.print(originalarray[i] + " ");
		}
		System.out.println();
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j] = arr[len-1];
					len--;
					j--;
				}
							
			}	
		}
		int[] newarray = Arrays.copyOf(originalarray, len);
		System.out.println("Array without duplicates: ");
		for(int i=0; i<newarray.length; i++)
		{
			System.out.print(newarray[i] + " ");
		}
	}		
	public static void main(String[] args) {
		RemoveDuplicates obj = new RemoveDuplicates();
		int[] array = {3,7,1,8,2,7,1,9,2,3,7,4,6};
		obj.rmvdup(array);
		System.out.println();

	}

}
