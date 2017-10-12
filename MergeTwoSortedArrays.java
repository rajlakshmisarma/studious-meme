package programs;

public class MergeTwoSortedArrays {

	/* merge 2 sorted arrays into a third array in sorted order */
	public void merge(int[] array1, int[] array2)
	{
		int len1 = array1.length;
		int len2 = array2.length;
		System.out.print("1st sorted array: ");
		for(int x=0; x<len1; x++)
		{
			System.out.print(array1[x] + " ");
		}
		System.out.println();
		System.out.print("2nd sorted array: ");
		for(int y=0; y<len2; y++)
		{
			System.out.print(array2[y] + " ");
		}
		System.out.println();
		int[] newarray = new int[len1+len2];
		int i, j, index;
		i = j = index = 0;
		while(i<len1 && j<len2)
		{
			if(array1[i]<array2[j])
			{
				newarray[index] = array1[i];
				i++;
				index++;
			}
			else
			{
				newarray[index] = array2[j];
				j++;
				index++;
			}
		}
		while(i<len1)
		{
			newarray[index++] = array1[i++];
		}
		while(j<len2)
		{
			newarray[index++] = array2[j++];
		}		
		System.out.println("Merged sorted array: ");
		for(int k=0; k<(len1+len2); k++)
		{
			System.out.print(newarray[k] + " ");
		}
	}
	public static void main(String[] args) {
		
		MergeTwoSortedArrays obj = new MergeTwoSortedArrays();
		// Enter 2 arrays only in sorted manner
		int[] array1 = {1, 5, 6, 8, 9, 15, 17};
		int[] array2 = {2, 3, 7, 10, 12};
		obj.merge(array1, array2);		
	}
}
