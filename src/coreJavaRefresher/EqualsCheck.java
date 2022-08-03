package coreJavaRefresher;

/*
 * We can use == operators for reference comparison (address comparison) and .equals() 
 * method for content comparison. In simple words, == checks if both objects point to 
 * the same memory location whereas .equals() evaluates to the comparison of values in 
 * the objects.
 */
public class EqualsCheck {
	public static void main(String[] args) {
		String s1 = "HELLO";//string pool 
		String s2 = "HELLO";//string pool same location as first
		String s3 = new String("HELLO");// new reference location but same content
		String s4 = new String("HELLO YOU");
		System.out.println(s1 == s2); // true as reference check
		System.out.println(s1 == s3); // false as reference check
		System.out.println(s1.equals(s2)); // true as content check
		System.out.println(s1.equals(s3)); // true as content check
		System.out.println(s1.equals(s4)); // false as content check
	}
}
