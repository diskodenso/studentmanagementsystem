package binTree;

/**
 * each class which implements this interface is a generic sorted binary tree
 * nodes of the tree can only contain comparable objects
 * @version 1.2
 * @param <E> any class which implements the interface Comparable<E>
 */

public interface BinTreeGenInterface<E extends Comparable<E>> {
	
	/**
	 * counts all nodes in a tree
	 * @return number of nodes
	 */
	int countNodes();
	
	
	/**
	 * inserts an item into a sorted tree in a sorted manner 
	 * (i.e. without destroying the sorting) if the item does not already exist 
	 * and returns true to indicate that the insertion was successful
	 * otherwise, if item does already exists or if item is null, 
	 * does not insert anything and returns false 
	 * @param item to be inserted
	 * @return true, if item was successfully inserted, false otherwise
	 */
	boolean insertNode(E item);
	
	
	/**
	 * searches for an item in a sorted tree
	 * @param item an item we search for
	 * @throws NullPointerException if item is null 
	 * @return node with the sought item or null if such a node does not exist
	 */
	BinNodeGen<E> find(E item) throws NullPointerException;
	
	
	/**
	 * returns String-serialization of all nodes of the tree
	 * @return String serialization of all nodes of the tree
	 */
	String toString();

}
