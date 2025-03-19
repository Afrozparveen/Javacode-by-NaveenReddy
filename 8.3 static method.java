What is a Static Method in Java?
	A static method in Java is a method that belongs to the class rather than to any specific instance (object). It is declared using the static keyword and can be called without creating an object of the class.

Syntax of a Static Method
class Example {
    static void display() { // Static method
        System.out.println("Hello from static method!");
    }

    public static void main(String[] args) {
        Example.display(); // Calling static method without creating an object
    }
}

Output:
Hello from static method!

Purpose of Static Methods::::::::::
	Class-Level Behavior – Used when a method does not depend on instance variables.
	Memory Optimization – No need to create an object to call the method.
	Utility Functions – Often used for helper methods like mathematical calculations (Math.sqrt()).
	Encapsulation of Common Logic – E.g., database connections, logging, etc.
Key Rules of Static Methods
✅ Can access static variables directly
✅ Can call other static methods directly
❌ Cannot access instance (non-static) variables or methods directly
❌ Cannot use this or super keywords

Example: Using Static Methods
class MathUtils {
    static int square(int num) { // Static method
        return num * num;
    }

    public static void main(String[] args) {
        int result = MathUtils.square(5); // Calling static method
        System.out.println("Square of 5 is: " + result);
    }
}
Output:
Square of 5 is: 25

Static vs. Non-Static Methods

Feature	                        Static Method (static)	            Non-Static Method (Instance Method)
Belongs To	             Class (shared across all objects)  	Individual object
Access Method	               ClassName.methodName()	                object.methodName()
Access Instance Variables?	       ❌ No	                             ✅ Yes
Can Use this or super?	               ❌ No	                              ✅ Yes
Memory Usage	              Stored in method area (efficient)	      Requires object in heap memory

Real-World Use Cases of Static Methods
	Utlity Methods – Math.pow(), Math.sqrt(), etc.
	Factory Methods – Integer.valueOf()
	Database Connections – DriverManager.getConnection()
	Common Constants & Configurations – System.getenv()
	Logger Methods – Used in logging frameworks like Log4j.
	
------->>>> public static void main (string args[]) in this if we didnt mentioned static what happend. and what is the purpose of static

What if We Don't Use static in public static void main(String args[])?
If we remove the static keyword from the main method, Java will compile the program successfully but will fail at runtime with an error like:

Error: Main method not found in class MyClass, please define the main method as:  
   public static void main(String[] args)

This happens because the Java Virtual Machine (JVM) calls the main method without creating an object. Since non-static methods require an object to be called, the JVM will not be able to find the main method properly.

Why is static Used in main?
	JVM Needs to Call main() Without an Object

	When Java starts, no objects of the class exist yet.
If main() were non-static, the JVM would need to create an object before calling it, which is not possible without having a defined way to instantiate the class.
Efficiency (No Need to Create an Object)

Using static saves memory and improves performance.
If main() were non-static, each program execution would require an unnecessary object creation.
Standard Convention

Java enforces main() to be static for consistency across different applications.
Example: Removing static from main()
🚫 Incorrect Code (Throws Runtime Error)

public class Test {
    public void main(String args[]) { // Missing 'static'
        System.out.println("Hello, Java!");
    }
}
🔴 Output:

Error: Main method not found in class Test, please define the main method as:
   public static void main(String[] args)
✅ Correct Code (Works Fine)

public class Test {
    public static void main(String args[]) { // Correct, with 'static'
        System.out.println("Hello, Java!");
    }
}
🟢 Output:

Hello, Java!

What If We Want to Use a Non-Static main()?
If we insist on using a non-static main(), we need to create an object manually inside a static block or another static method.

✔ Example: Calling Non-Static main() via an Object

public class Test {
    public void main(String args[]) { // Non-static main method
        System.out.println("Hello from non-static main!");
    }

    public static void main(String args[]) { // Static entry point
        Test obj = new Test(); // Creating object manually
        obj.main(args); // Calling non-static main method
    }
}
🟢 Output:

Hello from non-static main!
However, this approach is not recommended because it adds unnecessary complexity.

Key Takeaways
Question	                                              Answer
What happens if static is removed from main()?	      The JVM throws a runtime error because it cannot call main() without an object.
Why is static needed in main()?	                     So the JVM can call it without creating an object (saves memory & avoids unnecessary instantiation).
Can we use main() without static?	            Yes, but we must manually create an object inside a static method, which is not recommended.

	
--------->>>>>>>difference between static and non static methods

Difference Between Static and Non-Static Methods in Java

Feature	                                  Static Method (static)	Non-Static Method (Instance Method)
Belongs To	                               Class	                      Object (Instance of the class)
Called Using	                       ClassName.methodName()	              object.methodName()
Requires an Object?	                       ❌ No	                              ✅ Yes
Can Access Static Variables?             	✅ Yes	                               ✅ Yes
Can Access Non-Static (Instance) Variables?	❌ No	                               ✅ Yes
Can Call Other Static Methods?	                ✅ Yes                           	✅ Yes
Can Call Non-Static Methods?	                ❌ No	                                ✅ Yes
Uses this or super?	                        ❌ No	                                ✅ Yes
Memory Usage                       Stored in method area (efficient)	        Stored in heap memory with objects
Use Case	         Utility functions, constants, class-level behavior	Instance-specific behavior, modifying object data

Static Method Example
class StaticExample {
    static void display() { // Static method
        System.out.println("Static method called!");
    }

    public static void main(String[] args) {
        StaticExample.display(); // Call without object
    }
}
✅ Output:
	Static method called!

Non-Static Method Example
class NonStaticExample {
    void show() { // Non-static method
        System.out.println("Non-static method called!");
    }

    public static void main(String[] args) {
        NonStaticExample obj = new NonStaticExample(); // Create object
        obj.show(); // Call using object
    }
}
✅ Output:
	Non-static method called!
Key Rule: Static Methods Cannot Access Non-Static Members Directly
🚫 Incorrect Code (Throws Error)

class Test {
    int x = 10; // Non-static variable

    static void display() {
        System.out.println(x); // ❌ Error! Cannot access non-static variable
    }
}
✔ Fix: Use an object to access non-static members

class Test {
    int x = 10;

    static void display() {
        Test obj = new Test(); // Create object
        System.out.println(obj.x); // ✅ Works fine
    }

    public static void main(String[] args) {
        display();
    }
}
✅ Output:

10

When to Use Static vs. Non-Static Methods?
Use static methods when::::::::::::::::::::
	The method does not depend on instance variables.
	The method is utility-based (e.g., Math.sqrt()).
	The method needs to be called without creating an object.
Use non-static methods when:::::::::::::::::::::::::::::::::::
	The method modifies or accesses instance variables.
	Each object should have its own behavior.

class Mobile{
	String brand;
	int price;
	String network;
//	String name;
	static String name;
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
	public static void show1(Mobile obj)
	{
//		System.out.println("in static method");
		System.out.println(obj.brand+" : "+ obj.price +" : "+obj.name);
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
		
		Mobile.show1(obj1);
		
		//System.out.println(obj1.brand);

	
	}
}


