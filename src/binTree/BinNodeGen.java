package binTree;

/**
 * A generic node to be used in a sorted binary tree.
 * @param <E> any class implementing Comparable<E>
 */
public class BinNodeGen<E extends Comparable<E>> {
    private E data;
    private BinNodeGen<E> left;
    private BinNodeGen<E> right;

    /**
     * Constructs a node containing the specified data.
     * @param data the value to store in this node
     */
    public BinNodeGen(E data) {
        this.data = data;
        left = null;
        right = null;
    }

    /**
     * Returns the data stored in the node.
     * @return data
     */
    public E getData() {
        return data;
    }

    /**
     * Sets the data in this node.
     * @param data new data
     */
    public void setData(E data) {
        this.data = data;
    }

    /**
     * Returns the left child.
     * @return left child
     */
    public BinNodeGen<E> getLeft() {
        return left;
    }

    /**
     * Sets the left child.
     * @param left new left child
     */
    public void setLeft(BinNodeGen<E> left) {
        this.left = left;
    }

    /**
     * Returns the right child.
     * @return right child
     */
    public BinNodeGen<E> getRight() {
        return right;
    }

    /**
     * Sets the right child.
     * @param right new right child
     */
    public void setRight(BinNodeGen<E> right) {
        this.right = right;
    }

    /**
     * Returns a string representation of the node.
     * @return string representation
     */
    @Override
    public String toString() {
        return data.toString();
    }
}