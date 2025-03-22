Inheritance:-

is, has
is is used in inheritance

Need for Inheritance in Java
	Inheritance is a fundamental concept in Java that allows one class (subclass/child class) to acquire the properties and behaviors (methods and fields) of another class (superclass/parent class).
	It is essential for code reusability, maintainability, and scalability in object-oriented programming.

Why Do We Need Inheritance?
1. Code Reusability:::::::::::::::::
	Inheritance allows a child class to reuse the fields and methods of an existing class without rewriting the same code.
	This reduces redundancy and improves efficiency.

2. Method Overriding (Polymorphism)
	Subclasses can provide specific implementations of methods that are already defined in the parent class.
	This promotes dynamic method dispatch and runtime polymorphism.

3.Improved Code Organization
	Helps in organizing code by creating a logical hierarchy of classes.
	Makes it easier to understand and modify.

4.Extensibility and Scalability
	New functionalities can be added easily without modifying existing code.
	The system remains flexible and scalable.

5.Encapsulation and Modularity
	Inheritance helps in maintaining encapsulation by restricting access to parent class members.
	It also promotes modularity by separating different functionalities across classes.

6.Reduction in Development Time and Cost
	By reusing existing code, development time and costs are reduced significantly.

Example of Inheritance in Java
// Parent class (Super Class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (Sub Class) inheriting Animal class
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
Conclusion

	Inheritance in Java is essential for efficient software development as it promotes code reuse, flexibility, maintainability, and scalability. It is a key feature of object-oriented programming that enhances
	code quality and development speed. 🚀


Class Calc     //Parent class , Super, Base
{
	add()
	sub()
	multi()
	div()
}

Class AdvCalc     //Child class, Sub, Derived 
{
	{
	}
}	
