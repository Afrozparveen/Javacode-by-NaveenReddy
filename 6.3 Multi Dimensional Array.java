2D, 3D, and Jagged Arrays in Java:::::::::::::
	Java allows the creation of multi-dimensional arrays, including 2D arrays (matrices), 3D arrays (cube-like structures), and jagged arrays (arrays of varying column sizes). Let's explore each one.

1. 2D Array (Two-Dimensional Array)
A 2D array is like a table or matrix, where data is stored in rows and columns.

Declaration and Initialization:::::
																		   
// Declaration and memory allocation
int[][] matrix = new int[3][3];  // 3x3 matrix (3 rows, 3 columns)
or direct initialization:
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

Accessing and Modifying Elements::::::::::::::
	
System.out.println(matrix[1][2]); // Output: 6 (row index 1, column index 2)
matrix[0][1] = 99; // Updating an element

Iterating Through a 2D Array (Nested Loops)

for (int i = 0; i < matrix.length; i++) {  // Rows
    for (int j = 0; j < matrix[i].length; j++) {  // Columns
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}


public class Demo {
	public static void main(String[] args) {
		int nums[][]=new int [3][4];
		//inr random=0;
		//int random=(int)Math.random()*100;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				nums[i][j]=(int)Math.random()*100;
				System.out.println(nums[i][j]);
			}
			System.out.println();
		}
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int n[]:nums)
		{
			for(int m:n)
			{
				System.out.println(m+" ");
			}
			System.out.println();
		}
	}
}
