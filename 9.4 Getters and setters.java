Getters and Setters in Java
What are Getters and Setters?
	Getters and Setters are methods used to access and modify private variables in a class.

✅ Getter (getX()) → Used to retrieve the value of a private variable.
✅ Setter (setX(value)) → Used to update the value of a private variable.

Encapsulation ensures that variables are private and accessed only via these methods.

Example: Getters and Setters in Java
class Person {
    private String name;  // Private variable (cannot be accessed directly)
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String newName) {
        name = newName;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age (with validation)
    public void setAge(int newAge) {
        if (newAge > 0) {  // Prevents negative age
            age = newAge;
        } else {
            System.out.println("Invalid Age!");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        
        // Using setter methods to set values
        p.setName("John");
        p.setAge(25);

        // Using getter methods to retrieve values
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
✅ Output:
Name: John
Age: 25

Why Use Getters and Setters?
Feature					Benefit
Encapsulation				Protects data by keeping variables private.
Validation				Ensures valid values (e.g., age cannot be negative).
Read-Only or Write-Only Control		Can allow only getting or only setting data.
Flexibility				You can modify the implementation without affecting other code.

Example: Read-Only and Write-Only Properties
Read-Only (Getter Only)
class Student {
    private int id = 101; // Fixed ID

    // Getter only (No setter)
    public int getId() {
        return id;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Student ID: " + s.getId());

        // s.setId(202); // ❌ ERROR: No setter method available
    }
}
✅ Output:
Student ID: 101
✔ ID cannot be changed since there’s no setter.

Write-Only (Setter Only)
class SecretData {
    private String password; // Hidden data

    // Setter only (No getter)
    public void setPassword(String password) {
        this.password = password;
    }
}

public class Main {
    public static void main(String[] args) {
        SecretData data = new SecretData();
        data.setPassword("Secure123");

        // System.out.println(data.getPassword()); // ❌ ERROR: No getter available
    }
}
✔ Password is stored but cannot be retrieved.

Summary: Getters and Setters

Feature			Getter (getX())			Setter (setX(value))
Purpose		 Retrieve private variable value	Modify private variable value
Encapsulation		✅ Protects data		✅ Protects data
Validation		❌ No validation		✅ Can validate before updating
Usage			obj.getName();			obj.setName("John");

class Human
{
	//int age;
	//private int age=11;
	private int age;
	//String name;
	//private String name="Navin";
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}
	
//	public void SetAge(int a)
//	{
//		age=a;
//	}
	
//	public int abc()
//	{
//		return age;
//	}
//	public void xyz(int a)
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
//		obj.xyz(30);
		obj.SetAge(30);
		obj.setName("Reddy");
//		obj.age=11;
//		obj.name="Navin";
		
//		System.out.println(obj.abc()+" : "+obj.getAge());
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}
