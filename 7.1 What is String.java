In Java, a String is an object that represents a sequence of characters. It is part of the java.lang package and is widely used for text manipulation.

Key Features of Strings in Java:
	Immutable – Once created, a String object cannot be changed. Any modification creates a new object.
	Stored in String Pool – Java uses a special memory area called the String Pool to manage String objects efficiently.
	Supports Methods – The String class provides many useful methods for string manipulation, such as .length(), .substring(), .concat(), .replace(), .toUpperCase(), and .toLowerCase().

Declaring Strings:
// Using String literal (stored in the String Pool)
String str1 = "Hello, Java!";

// Using the new keyword (stored in Heap memory)
String str2 = new String("Hello, Java!");

Common String Methods:
public class StringExample {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        
        System.out.println(str.length());         // Get length
        System.out.println(str.toUpperCase());   // Convert to uppercase
        System.out.println(str.toLowerCase());   // Convert to lowercase
        System.out.println(str.contains("Java"));// Check if contains "Java"
        System.out.println(str.substring(7, 11));// Extract "Java"
        System.out.println(str.replace("Java", "World")); // Replace text
    }
}
public class Demo {
	public static void main(String[] args) 
	{
		String name=new String();
		System.out.println(name);
		System.out.println(name.hashCode());
		System.out.println("hello "+name);
		System.out.println(name.concat("reddy"));
//      String name="Navin";
		
	}
}
