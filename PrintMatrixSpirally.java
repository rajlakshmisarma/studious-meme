package programs;

public class PrintMatrixSpirally {

	/**
	 * Given a matrix, print the elements spirally clockwise and anti-clockwise
	 */
	public static void main(String[] args) {
		PrintMatrixSpirally obj = new PrintMatrixSpirally();
		int[][] matrix = { {1, 2, 3, 4, 5},
						{6, 7, 8, 9, 10},
						{11, 12, 13, 14, 15},
						{16, 17, 18, 19, 20}
					};
		int columns = matrix[0].length;
		int rows = matrix.length;
		System.out.println("The given MxN matrix is: ");
		for(int i = 0; i<rows; i++) //printing the given matrix in same order
		{
			for(int j=0; j<columns; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		obj.clockwiseSpiralPrint(matrix); //calling clockwise spiral printing of the matrix
		System.out.println();
		obj.anticlockwiseSpriralPrint(matrix); //calling anti-clockwise spiral printing of the matrix
	}
	
	// Print matrix spirally in clockwise direction
	public void clockwiseSpiralPrint(int[][] matrix)
	{
		int top = 0;
		int left = 0;
		int right = matrix[0].length-1; //total number of columns
		int down = matrix.length-1; //total number of rows
		System.out.println("The matrix elements printed in spiral order - clockwise direction: ");
		while(true)
		{
			for(int i = left; i<=right; i++) //1. print from left to right along the first row
				{System.out.print(matrix[top][i] + " ");}
				top++;
				if(top > down || left > right) break;
								
			for(int i = top; i<=down; i++) //2. print from right element to the last element along the last column
				{System.out.print(matrix[i][right] + " ");}
				right--;
				if(top > down || left > right) break;
				
			for(int i = right; i>=left; i--) //3. print from the last position of right to left along the bottom row
				{System.out.print(matrix[down][i] + " ");}
				down--;
				if(top > down || left > right) break;
				
			
			for(int i = down; i>=top; i--) //4. print from the last down position to the top along the first column
				{System.out.print(matrix[i][left] + " ");}
				left++;
				if(top > down || left > right) break;				
		}
	}
	
	// Print matrix spirally in anti-clockwise direction
	public void anticlockwiseSpriralPrint(int matrix[][])
	{
		int top = 0;
		int left = 0;
		int right = matrix[0].length-1; //total number of columns
		int down = matrix.length-1; //total number of rows
		System.out.println("The matrix elements printed in spiral order - anti-clockwise direction: ");
		while(true)
		{
			for(int i = top; i<=down; i++) //1. print from the top left element to the last element along the first column
			{ System.out.print(matrix[i][left] + " "); }
			left++;
			if(top > down || left > right) break;
			
			for(int i=left; i<=right; i++) //2. print from the last element in the first column to the right most element along the last row
			{ System.out.print(matrix[down][i] + " "); }
			down--;
			if(top > down || left > right) break;
			
			for(int i=down; i>=top; i--) //3. print from the down rightmost element to the top element up the last column
			{ System.out.print(matrix[i][right] + " ");}
			right--;
			if(top > down || left > right) break;
			
			for(int i=right; i>=left; i--) //4. print from the rightmost element to the left element along the first row
			{ System.out.print(matrix[top][i] + " "); }
			top++;
			if(top > down || left > right) break;
		}
	}
}
