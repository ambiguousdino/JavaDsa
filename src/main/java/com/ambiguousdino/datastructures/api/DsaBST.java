package com.ambiguousdino.datastructures.api;

/**
 * A generic interface for implementing a Binary Search Tree (BST).
 *
 * @param <ElemType> the type of elements held in this binary search tree.
 *                   The elements must either:
 *                   <ul>
 *                       <li>Implement the {@link Comparable} interface to define a natural ordering, or</li>
 *                       <li>Be compatible with a custom {@link java.util.Comparator} provided by the implementation.</li>
 *                   </ul>
 */
public interface DsaBST<ElemType> extends DsaTree<ElemType> {

    /**
     * Checks whether the specified value exists in the binary search tree.
     *
     * @param value the value to search for
     * @return {@code true} if the value exists in the tree, {@code false} otherwise
     * @throws NullPointerException if {@code value} is {@code null}
     */
    boolean contains(ElemType value);

    /**
     * Removes the specified value from the binary search tree, if it exists.
     *
     * @param value the value to remove
     * @return {@code true} if the value was successfully removed, {@code false} if
     *         the value was not found
     * @throws NullPointerException if {@code value} is {@code null}
     */
    boolean remove(ElemType value);

    /**
     * Finds and returns the minimum value in the binary search tree.
     *
     * @return the minimum value in the tree
     * @throws IllegalStateException if the tree is empty
     */
    ElemType findMin();

    /**
     * Finds and returns the maximum value in the binary search tree.
     *
     * @return the maximum value in the tree
     * @throws IllegalStateException if the tree is empty
     */
    ElemType findMax();

}
