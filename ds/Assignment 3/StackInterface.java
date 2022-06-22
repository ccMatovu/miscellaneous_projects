/**Charles Matovu
 * Prof. Abier Hassan
 * Data Structures
 * Assignment 3: 10/12/2020
 *
 *
   An interface for the ADT stack.
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
 */
public interface StackInterface<T>
{
   /** Adds a new entry to the top of this stack.
       @param newEntry  An object to be added to the stack. */
   public void push(T newEntry);
   
   /** Removes and returns this stack's top entry.
       @return  The object at the top of the stack.
       @throws  EmptyStackException if the stack is empty before the operation. */
   public T pop();
   
   /** Retrieves this stack's top entry.
       @return  The object at the top of the stack.
       @throws  EmptyStackException if the stack is empty. */
   public T peek();

	/** Detects whether this stack is empty.
		 @return  True if the stack is empty. */
	public boolean isEmpty();

	/** Removes all entries from this stack. */
	public void clear();

    /**Checks if the stack has more than one entry and returns the second item.
        @return The second Object in the stack
        @throws Exception if stack has less than 2 entries */
    public T peek2();
} // end StackInterface
