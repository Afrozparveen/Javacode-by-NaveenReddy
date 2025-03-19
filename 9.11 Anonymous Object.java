Anonymous Object in Java
What is an Anonymous Object?
	An anonymous object is an object that is created but not assigned to a reference variable. It is typically used when the object is needed only once.

Syntax:
new ClassName().methodName();
Example 1: Anonymous Object Calling a Method
class Demo {
    void show() {
        System.out.println("Hello from Anonymous Object!");
    }

    public static void main(String[] args) {
        new Demo().show(); // Anonymous object calling the method
    }
}
✅ Output:
Hello from Anonymous Object!
	✔ No reference variable is assigned to the Demo object.

Example 2: Using an Anonymous Object as a Parameter
class Square {
    int calculateSquare(int num) {
        return num * num;
    }
}

public class AnonymousExample {
    public static void main(String[] args) {
        System.out.println("Square of 5: " + new Square().calculateSquare(5));
    }
}
✅ Output:
Square of 5: 25
	✔ The Square object is created and used immediately without storing it in a variable.

Example 3: Anonymous Object in a Constructor
class Car {
    Car() {
        System.out.println("Car is created!");
    }
}

public class Main {
    public static void main(String[] args) {
        new Car(); // Anonymous object used for calling the constructor
    }
}
✅ Output:
Car is created!
	✔ Since no reference is assigned, the object is immediately eligible for garbage collection.

When to Use Anonymous Objects?
	✅ When the object is used only once (e.g., calling a method once).
	✅ When you don’t need to store the object for reuse.
	✅ To reduce memory usage (less reference variables).

When NOT to Use Anonymous Objects?
❌ If you need to use the same object multiple times, store it in a variable instead.
Example:
Car c = new Car(); // Store the object for reuse
c.start();
c.stop();
Using an anonymous object here:
new Car().start();
new Car().stop(); // Creates a new Car object instead of reusing it
✔ This creates two different objects, which is inefficient.
	
class A
{
	public A()
	{
		System.out.println("object created");
	}
	public void show()
	{
		System.out.println("in A show");
	}
}


public class Demo
{
	public static void main(String a[]) 
	{
		int marks;
		marks=99;
		
		new A();   //anonymous object
		new A().show();
		
//		A obj=new A();
		A obj;
		obj=new A();
		
		obj.show();
	}
}


