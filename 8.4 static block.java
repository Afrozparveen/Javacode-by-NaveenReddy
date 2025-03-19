What is a Static Block in Java?
	A static block in Java is a block of code inside a class that is executed once when the class is loaded into memory. It is declared using the static keyword and does not require an object to execute.

Syntax of a Static Block
class Example {
    static { 
        System.out.println("Static block executed!"); 
    }

    public static void main(String[] args) {
        System.out.println("Main method executed!");
    }
}
✅ Output:
Static block executed!  
Main method executed!
✔ The static block runs first, before the main() method, because it executes when the class is loaded into memory.

Purpose of Static Block:::::::::::::::::
	Initialize Static Variables – Useful for complex static variable initialization.
	Execute Code Before main() – Runs before any method is called.
	Loading Configuration or Resources – Used to initialize database connections, reading files, etc.

Example: Initializing Static Variables Using a Static Block
class Test {
    static int num;
    
    static { 
        num = 100; // Initialize static variable
        System.out.println("Static block executed, num = " + num);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed!");
    }
}
✅ Output:
Static block executed, num = 100  
Main method executed!

Multiple Static Blocks in a Class
✔ Java allows multiple static blocks, which are executed in order of appearance.
class Demo {
    static {
        System.out.println("Static Block 1");
    }

    static {
        System.out.println("Static Block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
✅ Output:
Static Block 1  
Static Block 2  
Main Method

Using Static Block for Database Connection (Real-World Example)
class Database {
    static {
        System.out.println("Connecting to the database...");
        // Simulate database connection setup
    }

    public static void main(String[] args) {
        System.out.println("Application is running...");
    }
}
✅ Output:
Connecting to the database...  
Application is running...
✔ The static block ensures that the database connection is set up before the program runs.

Key Takeaways
Feature	                         Static Block (static {})
When Does It Run?          When the class is loaded into memory
Runs Before main()?	             ✅ Yes
Object Creation Required?	     ❌ No
Use Case	           Initialize static variables, execute setup code, load resources

class Mobile{
	String brand;
	int price;
	String network;
	static String name;
	
	static {
		name="Phone";
		System.out.println("in static block");
	}
	
	public Mobile() {
		brand="";
		price=200;
//		name="Phone";
		System.out.println("in constructor");
	}
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
	
}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		Class.forName("Mobile");
		
//		Mobile obj1=new Mobile();
//		obj1.brand="Apple";
//		obj1.price=1500;
//		Mobile.name="SmartPhone";
//		
//		Mobile obj2=new Mobile();

	
	}
}
