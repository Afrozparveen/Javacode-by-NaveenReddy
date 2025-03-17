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
	public static void main(String[] args) 
	{
//		int nums[][]=new int [3][]; //jagged
//		nums[0]=new int [3];
//		nums[1]=new int [4];
//		nums[2]=new int [2];
		
		int nums[][]=new int [3][4];
//		int nums[][]=new int [3][4][5]; // three dimensional
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				nums[i][j]=(int)(Math.random()*10);
			}
		}
	}
}
