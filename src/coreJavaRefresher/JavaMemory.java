package coreJavaRefresher;

/*https://www.geeksforgeeks.org/how-many-types-of-memory-areas-are-allocated-by-jvm/
	Class(Method) Area-->
	the class code, variable code(static variable, runtime constant), method code, and the constructor of a Java program. (Here method means the function which is written inside the class). It stores class-level data of every class such as the runtime constant pool, 
	field and method data, the code for methods.
	
	Heap-->The Heap area is the memory block where objects are created or objects are stored. Heap memory allocates memory for class interfaces and arrays (an array is an object). 
	It is used to allocate memory to objects at run time
	
	String pool-->As the name suggests, String Pool in java is a pool of Strings stored in Java Heap Memory
	
	Stack-->Each thread has a private JVM stack, created at the same time as the thread. It is used to store data and partial results which will be needed while 
	returning value for method and performing dynamic linking.
	JavaStack stores frames and a new frame is created each time at every invocation of the method. 
	A frame is destroyed when its method invocation completes
	
	Program Counter Register-->Each JVM thread that carries out the task of a specific method 
	has a program counter register associated with it
	
	Native Method Stack-->Also called C stacks, native method stacks are not written in Java language. This memory is allocated for each thread when 
	it’s created And it can be of a fixed or dynamic nature.
	*/
public class JavaMemory {

}
