this Keyword in Java
What is this in Java?
	The this keyword refers to the current instance of the class. It is used to differentiate instance variables from local variables and to access the current object's properties and methods.

Uses of this Keyword
1️⃣ Differentiating Instance Variables from Local Variables
	When local and instance variables have the same name, this helps distinguish them.

class Student {
    private String name;

    // Constructor
    public Student(String name) {
        this.name = name;  // "this.name" refers to the instance variable
    }

    public void display() {
        System.out.println("Student Name: " + this.name);
    }

    public static void main(String[] args) {
        Student s = new Student("John");
        s.display();
    }
}
✅ Output:
Student Name: John
	✔ Without this, name = name; would assign the local variable to itself, which is incorrect.

2️⃣ Calling One Constructor from Another (Constructor Chaining)
	Use this() to call another constructor within the same class.
class Car {
    private String brand;
    private int speed;

    // Constructor 1
    public Car() {
        this("Toyota", 120); // Calls the second constructor
        System.out.println("Default constructor called!");
    }

    // Constructor 2
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Car: " + brand + ", Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        Car c = new Car();  // Calls first constructor
        c.display();
    }
}
✅ Output:
Default constructor called!
Car: Toyota, Speed: 120 km/h
✔ this("Toyota", 120); calls the second constructor before executing the first one.

3️⃣ Returning Current Class Instance (this)
The this keyword can be used to return the current instance of the class.

class Example {
    public Example getInstance() {
        return this; // Returning the current object
    }

    public void show() {
        System.out.println("Method is called using 'this'.");
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.getInstance().show();  // Calling show() using 'this'
    }
}
✅ Output:
Method is called using 'this'.

4️⃣ Passing this as an Argument
You can pass this to another method to refer to the current object.
class Test {
    void display(Test obj) {
        System.out.println("Method called using 'this'.");
    }

    void call() {
        display(this); // Passing current instance
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.call();
    }
}
✅ Output:
Method called using 'this'.
✔ The this keyword passes the current object reference to display().

5️⃣ Accessing Instance Methods and Variables
Use this to call instance methods inside another method.
class Demo {
    void show() {
        System.out.println("Inside show method");
    }

    void display() {
        this.show();  // Calls show() method
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
    }
}
✅ Output:
Inside show method
✔ this.show(); calls another method of the same instance.

6️⃣ Preventing Shadowing of this in Setters
In setters, this prevents naming conflicts.
class Employee {
    private String name;

    public void setName(String name) {
        this.name = name; // "this.name" refers to instance variable
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Alice");
        System.out.println("Employee Name: " + e.getName());
    }
}
✅ Output:
Employee Name: Alice
✔ Without this, the setter would not modify the instance variable properly.

Summary: When to Use this
Use Case				Example
Access instance variables		this.name = name;
Invoke another constructor		this();
Return current instance	return 		this;
Pass current object as argument		someMethod(this);
Call instance methods			this.methodName();

class Human
{
	
	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void SetAge(int age, Human obj)
	{
		//Human obj1=new Human();
		Human obj1=obj;
		obj1.age=age;
		//this.age=age;
	}
	
//	public void SetAge(int a)
//	{
//		age=a;
//	}

	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
//	public void setName(String n)
//	{
//		name=n;
//	}

}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();

		obj.SetAge(30,obj);
//		obj.SetAge(30);
		obj.setName("Reddy");
		
//		System.out.println(obj.abc()+" : "+obj.getAge());
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}
