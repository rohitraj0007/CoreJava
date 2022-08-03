package coreJavaRefresher;

public class StringVsCharArray {
	/*
	 * Strings are immutable. That means once you've created the String, if another process can dump memory, there's no way (aside from reflection) you can get rid of the data before garbage collection kicks in.

		With an array, you can explicitly wipe the data after you're done with it. You can overwrite the array with anything you like, and the password won't be present anywhere in the system, even before garbage collection.
	 
	 *thats y char[] prefered for password
	 *one more reason in logs array prints the address while string directly yhe passwords.
	 */
	public static void main(String[] args) {
	    Object pw = "Password";
	    System.out.println("String: " + pw);

	    pw = "Password".toCharArray();
	    System.out.println("Array: " + pw);
	}
}
