import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * Charles Matovu
 *  * Prof. Abier Hassan
 *  * Data Structures
 *  * Assignment 3: 10/12/2020
 * @param <T>
 */
public final class LinkedStack<T> implements StackInterface<T>
{
	private Node topNode; // References the first node in the chain
	
	public LinkedStack()
	{
		topNode = null;
	} // end default constructor
	
	public void push(T newEntry)
	{
		Node newNode = new Node(newEntry, topNode);
		topNode = newNode;
//    topNode = new Node(newEntry, topNode); // Alternate code
	} // end push

	public T peek()
	{
		if (isEmpty())
			throw new EmptyStackException();
		else
         return topNode.getData();
	} // end peek

  

   public T pop()
	{
	   T top = peek();  // Might throw EmptyStackException
   // Assertion: topNode != null
      topNode = topNode.getNextNode();

	   return top;
	} // end pop


	public boolean isEmpty()
	{
		return topNode == null;
	} // end isEmpty
	
	public void clear()
	{
		topNode = null;  // Causes deallocation of nodes in the chain
	} // end clear

	private class Node
	{
      private T    data; // Entry in stack
      private Node next; // Link to next node

      private Node(T dataPortion)
      {
         this(dataPortion, null);
      } // end constructor

      private Node(T dataPortion, Node linkPortion)
      {
         data = dataPortion;
         next = linkPortion;	
      } // end constructor

      private T getData()
      {
         return data;
      } // end getData

      private void setData(T newData)
      {
         data = newData;
      } // end setData

      private Node getNextNode()
      {
         return next;
      } // end getNextNode

      private void setNextNode(Node nextNode)
      {
         next = nextNode;
      } // end setNextNode
	} // end Node

	public T peek2(){
		//check if stack has fewer than 2 entries
		 try{
		 	 T topData = this.peek();
		 	 T secondData =this.topNode.getNextNode().data;
		 }catch (EmptyStackException e){
			 System.out.println("Exception:The stack has less than 2 entries");
		 }
		 return this.topNode.getNextNode().data;
	}// end peek2
} // end LinkedStack
