Creation of an Array in Java::::::::::::::::::
	In Java, an array is a collection of elements of the same data type stored in contiguous memory locations. You can create an array using the new keyword or by directly initializing it.

1. Declaration and Initialization of an Array
	
A. Using new Keyword
// Syntax: dataType[] arrayName = new dataType[size];

int[] numbers = new int[5];  // Creates an array of size 5
Here, numbers is an array of integers with space for 5 elements (default initialized to 0).

B. Direct Initialization
// Syntax: dataType[] arrayName = {val1, val2, ...};
int[] numbers = {10, 20, 30, 40, 50}; // Array of size 5 with values

2. Accessing and Modifying Array Elements
	Each element in an array is accessed using its index, starting from 0.

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[3];  // Creates an array of size 3

        // Assigning values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // Accessing values
        System.out.println("First element: " + numbers[0]); // Output: 10
        System.out.println("Second element: " + numbers[1]); // Output: 20
        System.out.println("Third element: " + numbers[2]); // Output: 30
    }
}
3. Creating Arrays of Different Data Types

A. Integer Array
int[] numbers = {1, 2, 3, 4, 5};

B. String Array
String[] names = {"Alice", "Bob", "Charlie"};

C. Double Array
double[] prices = {10.5, 20.75, 30.99};

D. Boolean Array
boolean[] flags = {true, false, true};

4. Iterating Through an Array
A. Using a For Loop
int[] numbers = {10, 20, 30, 40, 50};
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

B. Using Enhanced For Loop (For-Each)
for (int num : numbers) {
    System.out.println(num);
}

public class Demo {
	public static void main(String[] args) {
//      int nums[]= {3,7,2,4};
//		nums[1]=6;
//		System.out.println(nums[1]);
		
		int nums[]=new int[4];
		nums[0]=4;
		nums[1]=8;
		nums[2]=3;
		nums[3]=9;
		
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);
		
		for (int i=0;i<4;i++) {
			System.out.println(nums[i]);
		}
		
	}
}
