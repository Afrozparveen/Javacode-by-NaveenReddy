StringBuffer vs. StringBuilder in Java
	Both StringBuffer and StringBuilder are mutable classes used for modifying strings efficiently. The key difference between them is thread safety.

Feature	                        StringBuffer	                 StringBuilder
Mutability                         ✅ Mutable	                   ✅ Mutable
Thread Safety	              ✅ Yes (Synchronized)           ❌ No (Not Synchronized)
Performance	        Slower (because of synchronization)	Faster (no synchronization)
Usage	                       Multi-threaded programs             Single-threaded programs

1️⃣ StringBuffer (Thread-Safe)
	Thread-safe (synchronized), so it can be used in multi-threaded applications.
	Slower compared to StringBuilder due to synchronization overhead.
Example: Using StringBuffer
class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // Modifies the same object
        System.out.println(sb); // Output: Hello World
    }
}
✅ Output:
Hello World

2️⃣ StringBuilder (Faster, Not Thread-Safe)
	Not synchronized, so it performs faster than StringBuffer.
	Best for single-threaded applications.
Example: Using StringBuilder
class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Modifies the same object
        System.out.println(sb); // Output: Hello World
    }
}
✅ Output:
Hello World
Key Methods in Both StringBuffer and StringBuilder

Method		Description					Example
append()	Adds text to the end			sb.append(" World");
insert()	Inserts text at a specific position	sb.insert(5, " Java");
replace()	Replaces characters in a range		sb.replace(0, 5, "Hi");
delete()	Deletes characters in a range		sb.delete(0, 5);
reverse()	Reverses the string			sb.reverse();

Example: Comparing StringBuffer and StringBuilder Performance
class PerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;
        
        // StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            sbf.append(" World");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ns");

        // StringBuilder
        StringBuilder sbd = new StringBuilder("Hello");
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            sbd.append(" World");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ns");
    }
}
✅ Expected Output (StringBuilder is faster):
Time taken by StringBuffer: 500000 ns  
Time taken by StringBuilder: 300000 ns  

When to Use What?
	✅ Use StringBuffer if multiple threads modify the same string.
	✅ Use StringBuilder for single-threaded applications (better performance).
❌ Don't use StringBuffer if you don’t need thread safety, as it's slower.class Demo {
	public static void main(String[] args) 
	{
		StringBuffer sb= new StringBuffer("Navin");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
		sb.append("Reddy");
		System.out.println(sb);
		
//		String str=sb.toString();
		
//		sb.deleteCharAt(2);
//		sb.insert(0,"Java");
//		sb.insert(6,"java");
//		sb.setLength(30);
		sb.ensureCapacity(100);
		
		System.out.println(sb);
	
	}
}
