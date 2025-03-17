1. Stack Memory (Faster, Method-Level Storage)
	Definition: Stack memory is used for storing method-specific values, including local variables and function call details.
How it Works:
	When a method is called, a stack frame is created in the stack memory.
	This frame stores method arguments, local variables, and return addresses.
	Once the method execution is complete, its stack frame is removed automatically (LIFO – Last In, First Out).
Key Characteristics:
	Memory is allocated and deallocated automatically.
	Stores primitive data types (int, char, float, etc.) and references to objects in the heap.
	Each thread has its own stack.
	Fast access time.
	Limited in size (can cause StackOverflowError if exceeded).
Example:
public class StackExample {
    public static void main(String[] args) {
        int a = 10; // Stored in stack
        int b = 20; // Stored in stack
        sum(a, b);
    }

    public static int sum(int x, int y) {
        int result = x + y; // Stored in stack
        return result;
    }
}
a, b, x, y, and result are stored in stack memory.

2. Heap Memory (Larger, Object Storage)
	Definition: Heap memory is used for storing objects and class instances.
How it Works:
	When an object is created using new, memory is allocated in the heap.
	References to these objects are stored in the stack.
	Objects in the heap are managed by the Garbage Collector (GC), which removes unused objects.
Key Characteristics:
	Global memory shared among all threads.
	Slower compared to stack due to garbage collection overhead.
	Stores instance variables, objects, and arrays.
	Unlimited in size (depends on system memory but can lead to OutOfMemoryError if overused).
Example:
class Car {
    String model; // Stored in heap

    Car(String model) {
        this.model = model;
    }
}

public class HeapExample {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla"); // Object stored in heap
    }
}
The Car object is created in the heap.
The reference myCar is stored in the stack.



class Calculator
{
	int num=5;
	public int add(int n1, int n2)
	{
		System.out.println(num);
		return n1+n2;
	}
}


public class Demo {
	public static void main(String[] args) {
		int data=10;
		Calculator obj=new Calculator();
		Calculator obj1=new Calculator();
		int r1=obj.add(3,4);
		//System.out.println(r1);
		obj.num=8;
		
		System.out.println(obj.num);
		System.out.println(obj1.num);
	}
}
