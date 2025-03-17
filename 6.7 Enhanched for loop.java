Enhanced For Loop in Java (For-Each Loop)
	The enhanced for loop, also called the for-each loop, is a simpler way to iterate over arrays and collections in Java.

1. Syntax of Enhanced For Loop
for (dataType variable : arrayName) {
    // Code to execute
}

dataType: The type of elements in the array.
variable: A temporary variable that stores each element.
arrayName: The array or collection to iterate over.

2. Example: Using Enhanced For Loop with Arrays
public class EnhancedForLoopExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Using enhanced for loop
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
Output:
10
20
30
40
50

3. Using Enhanced For Loop with Different Data Types
A. String Array Example
public class StringForEach {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};

        for (String name : names) {
            System.out.println(name);
        }
    }
}
Output:
Alice
Bob
Charlie

B. Double Array Example
double[] prices = {10.99, 20.49, 30.75};

for (double price : prices) {
    System.out.println(price);
}

4. Enhanced For Loop with 2D Arrays
	You can use a nested enhanced for loop to iterate over 2D arrays.
public class ForEach2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int[] row : matrix) {  // Iterating through rows
            for (int num : row) {  // Iterating through columns
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
Output:
1 2 3
4 5 6
7 8 9

class Student
{
	int rollno;
	String name;
	int marks;	
}

public class Demo {
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.rollno=1;
		s1.name="Navin";
		s1.marks=88;
		
		Student s2=new Student();
		s2.rollno=2;
		s2.name="Harsh";
		s2.marks=67;
		
		Student s3=new Student();
		s3.rollno=3;
		s3.name="Kiran";
		s3.marks=97;
		
		System.out.println(s1.name + ":"+ s1.marks);
		
		Student students[]=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
//		for(int i=0;i<students.length;i++)
//		{
//			System.out.println(students[i].name+":"+students[i].marks);
//		}
		
		for(Student stud: students)
		{
			System.out.println(stud.name +":"+stud);
		}
		
		
		
		
		int nums[]=new int[4];
		nums[0]=4;
		nums[1]=8;
		nums[2]=3;
		nums[3]=9;
		
//		for (int i=0;i<nums/length;i++)
//		{
//			System.out.println(nums[i]);
//		}
		
		for(int n: nums)
		{
			System.out.println(n);
		}
		
	}
}
