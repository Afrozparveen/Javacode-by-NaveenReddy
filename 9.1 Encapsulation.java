Encapsulation in Java
Definition:
	Encapsulation is one of the four fundamental OOP (Object-Oriented Programming) principles. It is the process of wrapping data (variables) and code (methods) together into a single unit (class) 
	and restricting direct access to the data.

Why Encapsulation?
	✅ Data Hiding – Prevents direct access to sensitive data.
	✅ Improves Security – Only controlled access via getter and setter methods.
	✅ Better Code Maintainability – Encapsulated code is modular and easier to modify.
	✅ Increases Reusability – The class can be reused without modifying its implementation.

How to Achieve Encapsulation?
	Declare variables as private (so they cannot be accessed directly).
	Provide public getter and setter methods to access and modify the variables.
Example of Encapsulation
class BankAccount {
    private double balance; // Private variable (data hiding)

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        }
    }

    // Getter method (to access the private variable)
    public double getBalance() {
        return balance;
    }

    // Setter method (to modify the private variable with validation)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
}

// Main class
public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Create an account with $1000 balance

        // Accessing private variable through public methods
        System.out.println("Current Balance: " + account.getBalance());

        // Modifying balance using setter method
        account.deposit(500);
        System.out.println("Updated Balance: " + account.getBalance());

        // Trying to modify balance directly (Not allowed)
        // account.balance = 2000; // ❌ ERROR: balance has private access
    }
}
✅ Output:
Current Balance: 1000.0  
Deposited: 500.0  
Updated Balance: 1500.0  

Benefits of Encapsulation
Feature					Description
Data Hiding		Prevents accidental modification of variables.
Controlled Access	Variables are accessed via getter/setter methods.
Security		Protects sensitive data from being directly accessed.
Flexibility		Logic for accessing/modifying variables can be changed later.

	Encapsulation vs Data Hiding
Concept		Encapsulation						Data Hiding
Definition	Wrapping data and methods into a class		Restricting direct access to data
Focus		Grouping and organizing				Preventing unauthorized access
Achieved by	Classes, getter/setter methods			Using private access modifier

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
	public void SetAge(int a)
	{
		age=a;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name=n;
	}
}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		obj.SetAge(30);
		obj.setName("Reddy");
//		obj.age=11;
//		obj.name="Navin";
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}
