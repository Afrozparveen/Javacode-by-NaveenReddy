this vs super in Java
Both this and super are reference keywords used in Java to interact with class constructors, methods, and variables.

Keyword	Used for
this	Refers to the current instance of the class
super	Refers to the parent (super) class
1️⃣ this Keyword in Java
Used to refer to the current object (same class).
Uses of this
✅ To refer to instance variables when shadowed by local variables
✅ To call another constructor in the same class (this())
✅ To return the current instance
✅ To pass the current instance as an argument to another method

Example 1: Using this to Resolve Variable Shadowing
java
Copy
Edit
class Student {
    String name;
    
    // Constructor
    public Student(String name) {
        this.name = name;  // Resolves naming conflict
    }

    void display() {
        System.out.println("Student Name: " + this.name);
    }

    public static void main(String[] args) {
        Student s = new Student("John");
        s.display();
    }
}
✅ Output:

yaml
Copy
Edit
Student Name: John
✔ Without this.name = name;, Java would get confused between instance and local variables.

Example 2: Calling Another Constructor Using this()
java
Copy
Edit
class Car {
    String brand;
    int speed;

    // Default Constructor
    public Car() {
        this("Toyota", 100);  // Calls the second constructor
    }

    // Parameterized Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Car: " + brand + ", Speed: " + speed);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.display();
    }
}
✅ Output:

yaml
Copy
Edit
Car: Toyota, Speed: 100
✔ this("Toyota", 100); calls the second constructor from the first.

Example 3: Returning Current Class Instance
java
Copy
Edit
class Example {
    Example getInstance() {
        return this;  // Returning the current object
    }

    void show() {
        System.out.println("Method called using 'this'");
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.getInstance().show();
    }
}
✅ Output:

sql
Copy
Edit
Method called using 'this'
✔ this allows method chaining by returning the current object.

2️⃣ super Keyword in Java
Used to refer to the immediate parent class.
Uses of super
✅ To call the parent class constructor (super())
✅ To access parent class methods (overridden methods)
✅ To access parent class variables when shadowed

Example 1: Calling Parent Class Constructor Using super()
java
Copy
Edit
class Parent {
    Parent() {
        System.out.println("Parent class constructor called.");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls the Parent constructor
        System.out.println("Child class constructor called.");
    }
    
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
✅ Output:

kotlin
Copy
Edit
Parent class constructor called.
Child class constructor called.
✔ super(); ensures the parent class is initialized first.

Example 2: Accessing Parent Class Methods Using super
java
Copy
Edit
class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound();  // Calls parent class method
        System.out.println("Dog barks.");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
✅ Output:

css
Copy
Edit
Animal makes a sound.
Dog barks.
✔ Without super.sound();, the parent class method wouldn't be called.

Example 3: Accessing Parent Class Variables
java
Copy
Edit
class Vehicle {
    int maxSpeed = 120;
}

class Car extends Vehicle {
    int maxSpeed = 200;

    void display() {
        System.out.println("Car Speed: " + maxSpeed);
        System.out.println("Vehicle Speed: " + super.maxSpeed);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
✅ Output:

yaml
Copy
Edit
Car Speed: 200
Vehicle Speed: 120
✔ Without super.maxSpeed, we wouldn't be able to access the parent class variable.

3️⃣ this vs super in Java
Feature	this	super
Refers to	Current class instance	Parent class instance
Used for	Accessing instance variables, methods, constructors	Accessing parent class variables, methods, constructors
Calls	Another constructor in the same class (this())	Parent class constructor (super())
Access	Current class methods and variables	Parent class methods and variables
Can be used in static context?	❌ No	❌ No
4️⃣ When to Use this vs super?
Scenario	Use this	Use super
Access current class variables	this.variableName	❌ Not needed
Access parent class variables	❌ Not needed	super.variableName
Call another constructor in the same class	this(arguments)	❌ Not needed
Call parent class constructor	❌ Not needed	super(arguments)
Call current class method	this.methodName()	❌ Not needed
Call parent class method	❌ Not needed	super.methodName()
Final Example Using Both this and super
java
Copy
Edit
class Parent {
    int x = 10;

    Parent() {
        System.out.println("Parent Constructor");
    }

    void show() {
        System.out.println("Parent show() method");
    }
}

class Child extends Parent {
    int x = 20;

    Child() {
        this(30); // Calls parameterized constructor
        System.out.println("Child Constructor");
    }

    Child(int x) {
        super(); // Calls Parent constructor
        this.x = x;
    }

    void display() {
        System.out.println("Child x: " + this.x);
        System.out.println("Parent x: " + super.x);
    }

    void show() {
        super.show(); // Calls parent class method
        System.out.println("Child show() method");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.show();
    }
}
✅ Output:

sql
Copy
Edit
Parent Constructor
Child Constructor
Child x: 30
Parent x: 10
Parent show() method
Child show() method
✔ Demonstrates both this and super in a real-world scenario.

/**
// super()
class A
{
	public A() 
	{
		super();
		System.out.println("in A");
	}
	public A(int n)
	{
		super();
		System.out.println("in A int");
	}
}
class B extends A
{
	public B()
	{
//		super();
		super(5);
		System.out.println("in B");
	}
	public B(int n)
	{
//		super();   //call default constructor of super class
		super(n);
		System.out.println("in B int");
	}
}
public class Demo {
	public static void main(String[] args) 
	{
		
		B obj=new B();
//		B obj=new B(5);
	}
}
**/


//this() 
class A
{
	public A() 
	{
		super();
		System.out.println("in A");
	}
	public A(int n)
	{
		super();
		System.out.println("in A int");
	}
}

class B extends A
{
	public B()
	{
		super();
		System.out.println("in B");
	}
	public B(int n)
	{
		this();  //call constructor of same class
		System.out.println("in B int");
	}
}
public class Demo {
	public static void main(String[] args) 
	{
		
//		B obj=new B();
		B obj=new B(5);
	}
}

