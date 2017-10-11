package programs;

public class ArrayofDigitsofNumber {

	/* utility function to reverse the array */
	private void reversearray(int[] arr, int start, int end)
	{
		int temp;
		while(start<end)
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	/* function to print an array containing digits of a given number */
	public void digitsFromNumber(int number)
	{
		System.out.println("Original Number: " + number);
		int length = Integer.toString(number).length();
		int[] array = new int[length];
		int digit=0;
		for(int i=0; i<length; i++)
		{
			while (number>0)
			{
				digit = number%10;
				number = number/10;
				break;
			}
		array[i] = digit;
		}
		System.out.println("The digits of the number in array: ");
		reversearray(array, 0, length-1);
		for(int i=0; i<length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
		
	public static void main(String[] args) {
		ArrayofDigitsofNumber obj = new ArrayofDigitsofNumber();
		obj.digitsFromNumber(736829510);

	}
}
