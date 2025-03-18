What is a Static Variable in Java?
	A static variable is a class-level variable declared using the static keyword. It is shared among all instances of the class, meaning that there is only one copy of the variable, regardless of how many objects of the class are created.

Syntax of Static Variable
class Example {
    static int staticVar = 10; // Static variable

    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        obj1.staticVar++; // Modifies the single shared variable
        System.out.println(obj2.staticVar); // Output: 11 (same value for all instances)
    }
}
Purpose & Advantages of Static Variables:::::::::::::
	
	Memory Efficiency – Since static variables are shared, they save memory by avoiding duplicate copies for each instance.
	Shared Data – Useful when you need a common variable accessible by all objects (e.g., a counter for tracking objects created).
	Class-Level Access – Can be accessed without creating an object, using ClassName.variableName.
	Better Performance – Reduces memory overhead compared to instance variables.

Example: Counting Objects with Static Variable
class Counter {
    static int count = 0; // Static variable shared by all objects

    Counter() {
        count++; // Increment count whenever an object is created
    }

    void displayCount() {
        System.out.println("Number of objects: " + count);
    }

    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        obj3.displayCount(); // Output: Number of objects: 3
    }
}
Key Points
	Declared using the static keyword.
	Stored in method area (class memory), not in heap memory.
	Accessible via class name (ClassName.variableName).
	Commonly used for counters, constants, and configuration values.
	
class Mobile{
	String brand;
	int price;
	String network;
//	String name;
	static String name;
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
}

public class Demo {
	public static void main(String[] args) 
	{
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price=1500;
		//obj1.name="SmartPhone";
		Mobile.name="SmartPhone";
		
		Mobile obj2=new Mobile();
		obj2.brand="Samsung";
		obj2.price=1700;
		//obj2.name="SmartPhone";
		Mobile.name="SmartPhone";
		
		//obj1.name="Phone";
		Mobile.name="SmartPhone";
		
		obj1.show();
		obj2.show();
		
		//System.out.println(obj1.brand);

	
	}
}
