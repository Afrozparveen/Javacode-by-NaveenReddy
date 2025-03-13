do-while Loop in Java::::::::::::
 	A do-while loop is a control flow statement that executes a block of code at least once, and then repeats the execution as long as a specified condition remains true.

Syntax of do-while Loop
	
do {
    // Code to execute
} while (condition);

The loop body executes first before checking the condition.
If the condition is true, the loop repeats.
If the condition is false, the loop terminates.

	
public class hello {

	public static void main(String[] args) {
		int i=1;
		do
		{
			System.out.println("Hi"+i);
			i++;
		}
		while(i<=4);
	}
}
