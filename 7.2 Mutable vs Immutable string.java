1. Immutable Strings (String class)
	The String class in Java is immutable, meaning that once a String object is created, it cannot be changed. Any modification (such as concatenation, replacing characters, or converting case) results
	in a new String object being created.

Example of Immutable String:

public class ImmutableStringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        str1.concat(" World"); // Creates a new string but does not modify str1
        
        System.out.println(str1); // Output: Hello (Original string remains unchanged)

        str1 = str1.concat(" World"); // Now, str1 points to a new string
        System.out.println(str1); // Output: Hello World
    }
}
Why are Strings immutable?

Security: Used in password storage, class loading, and networking.
Performance: String pool optimization allows reusing objects instead of creating duplicates.
Thread Safety: Multiple threads can share the same String object without synchronization issues.

	
2. Mutable Strings (StringBuilder and StringBuffer)::::::::::::::::::::
	To modify strings efficiently, Java provides StringBuilder and StringBuffer, which are mutable (modifiable without creating new objects).

StringBuffer (Thread-Safe, Synchronized)::::::::::::::
	StringBuffer is used when multiple threads modify the string simultaneously, as it is synchronized (thread-safe).

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // Modifies the original object
        System.out.println(sb); // Output: Hello World
    }
}

StringBuilder (Faster, Not Synchronized)::::::::::::::
	StringBuilder is not synchronized, making it faster than StringBuffer for single-threaded applications.

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb); // Output: Hello World
    }
}
public class Demo {
	public static void main(String[] args) 
	{
		String name="navin";
		name=name+"reddy";
		System.out.println("hello"+name);
		
		String s1="Navin";
		String s2="Navin";
		
		System.out.println(s1==s2);	
		
	}
}
