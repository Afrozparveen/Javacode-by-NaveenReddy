Single and Multilevel Inheritance in Java
	Inheritance is an OOP concept in Java that allows one class to inherit properties and behaviors from another.

1️⃣ Single Inheritance
	🔹 In Single Inheritance, a subclass inherits from a single parent class.
	🔹 This allows the child class to reuse methods and fields of the parent class.

Example of Single Inheritance
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

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited from Animal
        myDog.bark(); // Defined in Dog class
    }
}
Output:
This animal eats food.
Dog barks.

2️⃣ Multilevel Inheritance
	🔹 In Multilevel Inheritance, a class is derived from another derived class.
	🔹 This creates a chain of inheritance, where each class inherits from its predecessor.

Example of Multilevel Inheritance
// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Subclass inheriting from Dog
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.eat();  // Inherited from Animal
        myPuppy.bark(); // Inherited from Dog
        myPuppy.weep(); // Defined in Puppy
    }
}
Output:
This animal eats food.
Dog barks.
Puppy weeps.

Key Differences:

Feature				Single Inheritance					Multilevel Inheritance
Definition		One class inherits from another class			A class inherits from another derived class
Number of Levels		Two (Parent → Child)					Three or more (Grandparent → Parent → Child)
Complexity			Simple								Slightly complex
Code Reusability		Moderate					Higher (since multiple classes reuse existing code)

Conclusion
	✅ Single Inheritance is simpler and helps in code reuse.
	✅ Multilevel Inheritance enables a hierarchical structure but should be used carefully to avoid complexity.

🚀 Use inheritance wisely to improve code maintainability and scalability!

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


class AdvCalc extends Calc
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

//class VeryAdvCalc extends Calc
class VeryAdvCalc extends AdvCalc
{
	public double power(int n1,int n2)
	{
		return Math.pow(n1, n2);
	}
}

public class Demo
{
	public static void main(String a[]) 
	{
//		Calc obj=new Calc();
//		AdvCalc obj=new AdvCalc();
		VeryAdvCalc obj=new VeryAdvCalc();
		
		int r1=obj.add(4, 5);
		int r2=obj.sub(7,3);
		int r3=obj.multi(5,3);
		int r4=obj.div(15,4);
		double r5=obj.power(4,2);
		
		System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
		
	}
}

