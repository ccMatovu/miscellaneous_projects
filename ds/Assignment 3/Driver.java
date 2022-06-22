/**Charles Matovu
 * Prof. Abier Hassan
 * Data Structures
 * Assignment 3: 10/12/2020
 *
 *
 *
   A driver that demonstrates the class LinkedStack.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public class Driver 
{
	public static void main(String[] args) 
	{
		testStackOperations();
		System.out.println("\n\nDone.");
	}  // end main

	public static void testStackOperations()
	{
		System.out.println("Create a stack: ");
		StackInterface<String> myStack = new LinkedStack<>();

		System.out.println("\nAdd to stack to get\n" +
		                   "Joe Jane Jill Jess Jim");
		myStack.push("Jim");
		myStack.push("Jess");
		myStack.push("Jill");
		myStack.push("Jane");
		myStack.push("Joe");
		System.out.println("Jane is second in the stack, my stack returns \n"+myStack.peek2());

		System.out.println("\nNow Jonah,Johnson and Jack are added to the stack");
		myStack.push("Jonah");
		myStack.push("Johnson");
		myStack.push("Jack");

		System.out.println("\nJohnson should be returned since he is the second entry in the stack");
		System.out.println("peek2() returns "+myStack.peek2());


		myStack.clear();
		System.out.println("\n\nThe stack should be empty: ");
		System.out.println("isEmpty() returns " + myStack.isEmpty());


		System.out.println("\n\nWhen stack is empty, peek2 returns \n");
		myStack.peek2();

	} // end testStackOperations
}  // end Driver

