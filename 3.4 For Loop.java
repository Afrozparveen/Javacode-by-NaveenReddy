for Loop in Java::::::::::::::::
	A for loop is a control flow statement used when the number of iterations is known beforehand. It provides a concise way to iterate over a block of code.

Syntax of for Loop::::
	for (initialization; condition; update) {
    	// Code to execute
	}

Initialization → Initializes a loop control variable (executed once).
Condition → Checks if the loop should continue (evaluated before each iteration).
Update → Modifies the loop variable (executed after each iteration).
	
public class hello {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			System.out.println("Hi"+i);
		}
		
		
		for(int i=1;i<=7;i++)
		{
			System.out.println("Day"+i);
			for(int j=1;j<=9;j++)
			{
				System.out.println(" "+(j+8)+"-"+(j+9));
			}
		}
		
		
		int i=1;
		for(;i<=5;)
		{
			System.out.println("DAY"+i);
			i++;
		}
	}
}
