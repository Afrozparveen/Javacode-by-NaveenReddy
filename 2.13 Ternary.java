Ternary Operator in Java::::::::::::::::
	
	The ternary operator (?:) is a shorthand for if-else statements in Java. It allows for concise conditional expressions.

Syntax:

	variable = (condition) ? expression1 : expression2;

	If the condition is true, expression1 is assigned.
	If the condition is false, expression2 is assigned.
	
EXAMPLE:::::::::::::::::::::::::

public class hello {

	public static void main(String[] args) {
//		int n=4;
//		int result=0;
//		if(n%2==0)
//			result=10;
//		
//		else
//			result =20;
//		System.out.println(result);
		
		int n=5;
		int result=0;
		result = n%2==0 ? 10 : 20;
		System.out.println(result);
	}

}
