package com.ambiguousdino.datastructures.api;

/**
 * A generic interface for implementing a tree data structure.
 *
 * @param <ElemType> the type of elements held in this tree.
 *                   The elements must support comparison for equality, either by:
 *                   <ul>
 *                       <li>Providing a meaningful result from {@link Object#equals(Object)} implementation, or</li>
 *                       <li>Using a custom {@link java.util.Comparator} provided by the user.</li>
 *                   </ul>
 */
public interface DsaTree<ElemType> {
    /**
     * Returns the number of elements in the tree.
     * 
     * It is guaranteed that {@code size() == 0} if and only if {@code isEmpty()}
     * returns {@code true}.
     *
     * @return the size of the tree
     */
    int size();

    /**
     * Inserts the specified value into the tree.
     *
     * @param value the value to insert
     * @throws NullPointerException if {@code value} is {@code null}
     */
    void insert(ElemType value);

    /**
     * Checks whether the tree is empty.
     * A tree is considered empty if it has no elements.
     * It is guaranteed that {@code isEmpty()} returns {@code true} if and only if
     * {@code size() == 0}.
     * 
     * @return {@code true} if the tree contains no elements, {@code false}
     *         otherwise
     */
    boolean isEmpty();
}