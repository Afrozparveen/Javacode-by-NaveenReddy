Method Overloading in Java:::::::::::::::::::::
	Method overloading is a feature in Java that allows a class to have multiple methods with the same name but different parameters. The parameters can differ in:

Number of parameters
Data type of parameters
Sequence of parameters
	
It helps improve code readability and reusability.

Rules for Method Overloading:::::::::::::::::::::
	Methods must have the same name but different parameters.
	Return type does not play a role in method overloading.
	Changing just the return type will not be considered overloading.
	
class Calculator
{
	public int add(int n1, int n2, int n3)
	{
		return n1+n2+n3;
	}
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
	public double add(double n1, int n2)
	{
		return n1+n2;
	}
}


public class Demo {
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int r1=obj.add(3,4);
		System.out.println(r1);
	}
}
