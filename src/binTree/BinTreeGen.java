package binTree;

/**
 * A generic sorted binary tree that implements BinTreeGenInterface.
 * @param <E> any class implementing Comparable<E>
 */
public class BinTreeGen<E extends Comparable<E>> implements BinTreeGenInterface<E> {
    private BinNodeGen<E> root;

    /**
     * Parameterless constructor: creates an empty tree.
     */
    public BinTreeGen() {
        root = null;
    }

    /**
     * Counts all nodes in the tree.
     * @return number of nodes
     */
    @Override
    public int countNodes() {
        return countNodes(root);
    }

    // Hilfsmethode zur Rekursion
    private int countNodes(BinNodeGen<E> node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.getLeft()) + countNodes(node.getRight());
    }

    /**
     * Inserts an item into the sorted tree if it does not already exist.
     * @param item item to insert
     * @return true if insertion succeeded, false otherwise
     */
    @Override
    public boolean insertNode(E item) {
        if (item == null) {
            return false;
        }
        if (root == null) {
            root = new BinNodeGen<>(item);
            return true;
        }
        return insertNode(root, item);
    }

    // Rekursive Hilfsmethode für insertNode
    private boolean insertNode(BinNodeGen<E> node, E item) {
        int cmp = item.compareTo(node.getData());
        if (cmp == 0) {
            // Element ist bereits vorhanden.
            return false;
        } else if (cmp < 0) {
            if (node.getLeft() == null) {
                node.setLeft(new BinNodeGen<>(item));
                return true;
            } else {
                return insertNode(node.getLeft(), item);
            }
        } else { // cmp > 0
            if (node.getRight() == null) {
                node.setRight(new BinNodeGen<>(item));
                return true;
            } else {
                return insertNode(node.getRight(), item);
            }
        }
    }

    /**
     * Searches for an item in the sorted tree.
     * @param item item to search for
     * @return node containing the item, or null if not found
     * @throws NullPointerException if item is null
     */
    @Override
    public BinNodeGen<E> find(E item) throws NullPointerException {
        if (item == null) {
            throw new NullPointerException("Item cannot be null.");
        }
        return find(root, item);
    }

    // Rekursive Hilfsmethode für find
    private BinNodeGen<E> find(BinNodeGen<E> node, E item) {
        if (node == null) {
            return null;
        }
        int cmp = item.compareTo(node.getData());
        if (cmp == 0) {
            return node;
        } else if (cmp < 0) {
            return find(node.getLeft(), item);
        } else {
            return find(node.getRight(), item);
        }
    }

    /**
     * Returns an in-order String representation of the tree.
     * @return string serialization of all nodes
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        inOrderTraversal(root, sb);
        return sb.toString();
    }

    // Rekursive In-Order Traversal
    private void inOrderTraversal(BinNodeGen<E> node, StringBuilder sb) {
        if (node != null) {
            inOrderTraversal(node.getLeft(), sb);
            sb.append(node).append(" ");
            inOrderTraversal(node.getRight(), sb);
        }
    }
}