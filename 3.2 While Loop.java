while Loop in Java
A while loop is a control flow statement that repeatedly executes a block of code as long as a given condition evaluates to true. It is useful when the number of iterations is unknown in advance.

Syntax of while Loop
while (condition) {
    // Code to execute
}
The condition is checked before executing the loop body.
If the condition is true, the code inside the loop runs.
If the condition is false, the loop stops.

	
public class hello {

	public static void main(String[] args) {
		int i=1;
		
//		while(true)
//		{
//			System.out.println("Hi"+ i);
//			i++;
//		}
		
		
//		while(i<=4)
//		{
//			System.out.println("Hi"+ i);
//			i++;
//		}
//		System.out.println("Bye"+i);

		
		while(i<=4)
		{
			System.out.println("Hi"+ i);
			int j=1;
			while(j<=3) {
				System.out.println("Hello"+j);
				j++;
			}
			i++;
		}
		System.out.println("Bye"+i);
	}
}
