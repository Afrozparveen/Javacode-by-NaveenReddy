What is Inheritance in Java?
	Inheritance is an object-oriented programming (OOP) concept in Java that allows one class (child/subclass) to acquire the properties and behaviors (methods and fields) of another class (parent/superclass).
	It enables code reusability, hierarchical classification, and method overriding, making programs more organized and efficient.

Key Concepts of Inheritance:
Super Class (Parent Class) → The class whose features are inherited.
Sub Class (Child Class) → The class that inherits from another class.
extends Keyword → Used to establish an inheritance relationship between two classes.
Method Overriding → Allows the subclass to provide a specific implementation of a method from the superclass.
Super Keyword → Used to refer to the parent class members.

Types of Inheritance in Java

Single Inheritance → One class inherits from another.
Multilevel Inheritance → A class inherits from another class, which in turn inherits from another class.
Hierarchical Inheritance → Multiple classes inherit from a single parent class.
Multiple Inheritance (via Interfaces) → Java doesn’t support multiple inheritance with classes but allows it with interfaces.

Example of Inheritance in Java
// Parent class (Super Class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (Sub Class)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Inherited from Animal class
        myDog.bark(); // Defined in Dog class
    }
}
Output:
This animal eats food.
Dog barks.

Why Use Inheritance?
	✔ Code Reusability – Avoid rewriting the same code.
	✔ Improves Readability & Maintainability – Organizes the code efficiently.
	✔ Supports Polymorphism – Enables method overriding.
	✔ Enhances Extensibility – Easily extend existing code without modifications.

Conclusion
	Inheritance in Java establishes a relationship between classes where a child class inherits the attributes and methods of a parent class. It is a fundamental OOP concept that improves code efficiency, 
	reduces redundancy, and enhances maintainability. 🚀





class Calc
{
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
	public int sub(int n1, int n2)
	{
		return n1-n2;
	}
}


public class AdvCalc extends Calc
{
	public int multi(int n1, int n2)
	{
		return n1*n2;
	}
	public int div(int n1, int n2)
	{
		return n1/n2;
	}
}


public class Demo
{
	public static void main(String a[]) 
	{
//		Calc obj=new Calc();
		AdvCalc obj=new AdvCalc();
		int r1=obj.add(4, 5);
		int r2=obj.sub(7,3);
		int r3=obj.multi(5,3);
		int r4=obj.div(15,4);
		
		System.out.println(r1+" "+r2);
		
	}
}


