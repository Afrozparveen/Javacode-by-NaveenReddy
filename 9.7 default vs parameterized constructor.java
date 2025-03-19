Types of Constructors in Java

1️⃣ Default Constructor (No-Argument Constructor)
	A constructor with no parameters.
It initializes default values.
Example:
class Student {
    String name;
    int age;

    // Default Constructor
    public Student() {
        name = "Unknown";
        age = 18;
        System.out.println("Default Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student(); // Default constructor is called
        s.display();
    }
}
✅ Output:
Default Constructor Called
Name: Unknown, Age: 18

2️⃣ Parameterized Constructor
A constructor that takes arguments to initialize an object with custom values.
Example:
class Car {
    String brand;
    int speed;

    // Parameterized Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 120);
        car1.display();

        Car car2 = new Car("BMW", 150);
        car2.display();
    }
}
✅ Output:
Brand: Toyota, Speed: 120 km/h
Brand: BMW, Speed: 150 km/h
✔ Each object has different values.

3️⃣ Constructor Overloading
	Multiple constructors in the same class with different parameters.
Example:
class Employee {
    String name;
    int age;

    // Default Constructor
    public Employee() {
        name = "Not Provided";
        age = 0;
    }

    // Parameterized Constructor
    public Employee(String name) {
        this.name = name;
        this.age = 18; // Default age
    }

    // Another Parameterized Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Employee Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Alice");
        Employee e3 = new Employee("Bob", 25);

        e1.display();
        e2.display();
        e3.display();
    }
}
✅ Output:
Employee Name: Not Provided, Age: 0
Employee Name: Alice, Age: 18
Employee Name: Bob, Age: 25
✔ Overloaded constructors allow different ways to create an object.

4️⃣ Copy Constructor (Manually Created)
	Used to create a copy of an existing object.
Example:
class Book {
    String title;
    int pages;

    // Parameterized Constructor
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    // Copy Constructor
    public Book(Book b) {
        this.title = b.title;
        this.pages = b.pages;
    }

    void display() {
        System.out.println("Title: " + title + ", Pages: " + pages);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", 500);
        Book b2 = new Book(b1); // Copy constructor

        b1.display();
        b2.display();
    }
}
✅ Output:
Edit
Title: Java Programming, Pages: 500
Title: Java Programming, Pages: 500
✔ b2 is a copy of b1.


5️⃣ Using this() to Call Another Constructor (Constructor Chaining)
One constructor calls another constructor using this().
Example:
class Person {
    String name;
    int age;

    // Constructor 1 (Default)
    public Person() {
        this("Unknown", 18);  // Calls the second constructor
    }

    // Constructor 2 (Parameterized)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("David", 25);

        p1.display();
        p2.display();
    }
}
✅ Output:
Name: Unknown, Age: 18
Name: David, Age: 25
✔ this("Unknown", 18); calls the second constructor inside the first one.

Key Differences Between Constructor and Method
Feature					Constructor			Method
Purpose	    			Initializes an object		Performs actions (behavior)
Name	    			Same as the class name		Any valid method name
Return Type				No return type		Has a return type (or void)
Called Automatically?		Yes, when an object is created	No, must be explicitly called
Can Be Overloaded?			✅ Yes				✅ Yes
When to Use Constructors?
	✅ When initializing objects with default values (Default Constructor)
	✅ When setting custom values at object creation (Parameterized Constructor)
	✅ When allowing multiple ways to create an object (Constructor Overloading)
	✅ When creating a copy of an object (Copy Constructor)
	✅ When organizing constructors efficiently (Constructor Chaining using this())

class Human
{
	private int age;
	private String name;
	
	public Human()
	{
		age=12;
		name="John";
	}
	public Human(String name) {
		this.age=age;
		this.name=name;
	}
	public Human(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	
//	public Human()    //default constructor
//	{
//		age=12;
//		name="John";
//		//System.out.println("in constructor");
//	}
//	public Human(int a, String n)  //Parameterized constructor
//	{
//		age=a;
//		name=n;
//	}
	
	public int getAge(){
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
//		Human obj1=new Human(18, "Navin");
		System.out.println(obj.getName()+" : "+obj.getAge());
//		System.out.println(obj1.getName()+" : "+obj1.getAge());
		
//		obj.SetAge(30);
//		obj.setName("Reddy");
		

		//System.out.println(obj.getName()+" : "+obj.getAge());
	}
}


