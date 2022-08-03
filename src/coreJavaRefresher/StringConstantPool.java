package coreJavaRefresher;
/*
 * 
 */
public class StringConstantPool {
	
	
	public static void main(String[] args) {
		int num = 50;//num=50 is stored in stack
		String name ="Rohit";// name is stored in stack and "Rohit" in string pool of heap
		String fullName = new String("Rohit raj");// fullName is stored in stack and "Rohit Raj" in string pool of heap
		String nikName="Rohit";// nikName is stored in stack and "Rohit" is pointing to same string pool position of heap as variable name
		/*
		 * The variables created on the stack are deallocated as soon as the 
		 * thread completes execution. In contrast, a garbage collector reclaims 
		 * the resources in the heap. 
		 * Similarly, the garbage collector collects the un-referenced items from the pool
		 */
		
		/*
		 * The default size of the pool may differ on the different platforms. 
		 * In any case, it is still much bigger than the available stack size. 
		 * Before JDK 7, the pool was part of permgen space, 
		 * and from JDK 7 to now, it is part of the main heap memory.
		 */

		System.out.println(name==nikName);
	}

}
