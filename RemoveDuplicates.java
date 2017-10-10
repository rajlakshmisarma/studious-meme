package programs;

import java.util.Arrays;

public class RemoveDuplicates {

	public boolean contains(int newarray[], int originalarrayelement)
	{
		int len = newarray.length;
		for(int i=0; i<len; i++)
		{
			if(originalarrayelement==newarray[i])
			{
				return true;
			}
			else
			{
				continue;
			}
		}
		return false;		
	}
	public void rmvdup(int arr[])
	{
		int len = arr.length;
		int[] newarray = new int[len];
		int index=0;
		for(int i=0; i<len; i++)
		{
			if(contains(newarray, arr[i])==false)
			{
				newarray[index] = arr[i];
				index++;
			}
			else
			{
				continue;
			}
		}
		newarray = Arrays.copyOf(newarray, index);
		for(int i=0; i<newarray.length; i++)
		{
			System.out.print(newarray[i] + " ");
		}
	}	
	
	public static void main(String[] args) {
		RemoveDuplicates obj = new RemoveDuplicates();
		int[] array = {3,7,1,8,2,7,1,9,2,3,7,4,6};
		System.out.println("Original array:");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Array without duplicates:");
		obj.rmvdup(array);
		System.out.println();

	}
}
