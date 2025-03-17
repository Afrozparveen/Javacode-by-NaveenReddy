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

2. 3D Array (Three-Dimensional Array)
	A 3D array is like a cube, where each layer contains a 2D matrix.

Declaration and Initialization:::::::::
int[][][] cube = new int[2][2][2];  // 2 layers, 2 rows, 2 columns

or direct initialization:
int[][][] cube = {
    {
        {1, 2}, {3, 4}
    },
    {
        {5, 6}, {7, 8}
    }
};
Accessing Elements in a 3D Array

System.out.println(cube[1][0][1]); // Output: 6 (Layer 1, Row 0, Column 1)

Iterating Through a 3D Array (Triple Nested Loops)
for (int i = 0; i < cube.length; i++) { // Layers
    for (int j = 0; j < cube[i].length; j++) { // Rows
        for (int k = 0; k < cube[i][j].length; k++) { // Columns
            System.out.print(cube[i][j][k] + " ");
        }
        System.out.println();
    }
    System.out.println(); // Space between layers
}

3. Jagged Array (Irregular Array)
	A jagged array is a special type of 2D array where rows have different column sizes.

Declaration and Initialization
int[][] jagged = new int[3][]; // 3 rows with undefined column sizes

// Assigning different sizes to each row
jagged[0] = new int[2]; // 2 columns in row 0
jagged[1] = new int[4]; // 4 columns in row 1
jagged[2] = new int[3]; // 3 columns in row 2

or direct initialization:
int[][] jagged = {
    {1, 2},
    {3, 4, 5, 6},
    {7, 8, 9}
};
Accessing and Modifying Elements
System.out.println(jagged[1][2]); // Output: 5 (Row 1, Column 2)
jagged[2][1] = 99; // Updating an element

Iterating Through a Jagged Array
for (int i = 0; i < jagged.length; i++) {  // Rows
    for (int j = 0; j < jagged[i].length; j++) {  // Columns
        System.out.print(jagged[i][j] + " ");
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
