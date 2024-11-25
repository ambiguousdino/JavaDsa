package com.ambiguousdino.datastructures.api;

/**
 * A generic interface for implementing a Heap data structure.
 *
 * @param <ElemType> the type of elements held in this heap.
 *                   The elements must either:
 *                   <ul>
 *                       <li>Implement the {@link Comparable} interface to define a natural ordering, or</li>
 *                       <li>Be compatible with a custom {@link java.util.Comparator} provided by the implementation.</li>
 *                   </ul>
 */
public interface DsaHeap<ElemType> extends DsaTree<ElemType> {

    /**
     * Inserts the specified element into the heap.
     *
     * Postconditions:
     * <ul>
     * <li>The element is added to the heap, maintaining the heap invariant.</li>
     * <li>{@link #size()} increases by one.</li>
     * </ul>
     *
     * @param element the element to be inserted into the heap
     * @throws NullPointerException if the specified element is {@code null}
     */
    void insert(ElemType element);

    /**
     * Extracts and returns the top element from the heap.
     * -- Largest element for max-heap
     * -- Smallest element for min-heap
     *
     * The top element is the root of the heap and is removed from the heap,
     * maintaining the heap invariant.
     *
     * @return the extracted top element
     * @throws IllegalStateException if the heap is empty
     */
    ElemType extract();

    /**
     * Returns, but does not remove, the top (min or max) element of the heap.
     *
     * @return the top element of the heap
     * @throws IllegalStateException if the heap is empty
     */
    ElemType peek();
}
