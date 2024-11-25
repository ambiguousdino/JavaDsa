package com.ambiguousdino.datastructures.api;

/**
 * A generic interface for implementing a List data structure.
 *
 * @param <ElemType> the type of elements held in this list.
 *                   The elements must support comparison for equality, either by:
 *                   <ul>
 *                       <li>Providing a meaningful result from {@link Object#equals(Object)} implementation, or</li>
 *                       <li>Using a custom {@link java.util.Comparator} provided by the user.</li>
 *                   </ul>
 */

public interface DsaList<ElemType> {
    /**
     * Adds the specified element to the list. The element cannot be {@code null}.
     * 
     * @param element the element to be added to the list
     * @throws NullPointerException if {@code element} is {@code null}
     */
    void add(ElemType element);

    /**
     * Retrieves the element at the specified index.
     * 
     * @param index the position of the element to retrieve, starting from 0
     * @return the element at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range
     *                                   (index &lt; 0 || index &gt;= size())
     */
    ElemType get(int index);

    /**
     * Removes the first occurrence of the specified element from the list,
     * if it is present.
     *
     * @param element the element to be removed from the list
     * @return {@code true} if the element was removed successfully,
     *         {@code false} if the element was not found
     */
    boolean remove(ElemType element);

    /**
     * Returns the number of elements currently in the list.
     * If the list is empty, this method returns {@code 0}.
     * It is guaranteed that {@code size() == 0} if and only if {@code isEmpty()}
     * returns {@code true}.
     *
     * @return the size of the list
     */
    int size();

    /**
     * Checks if the list is empty.
     * A list is considered empty if it contains no elements.
     * It is guaranteed that {@code isEmpty()} returns {@code true} if and only if
     * {@code size() == 0}.
     *
     * @return {@code true} if the list contains no elements, {@code false}
     *         otherwise
     */
    boolean isEmpty();

    /**
     * Removes all elements from the list. After this call returns, the list will be
     * empty.
     * 
     * Postconditions:
     * <ul>
     * <li>{@link #size()} returns <code>0</code>.</li>
     * <li>{@link #isEmpty()} returns <code>true</code>.</li>
     * </ul>
     */
    void clear();

    /**
     * Returns {@code true} if the list contains the element.
     *
     * This method checks whether the list contains at least one element that is
     * equal to the element passed as the parameter.
     * Equality is determined using the {@code equals()} method of the elements.
     *
     * @param element element whose presence in the list is to be tested
     * @return {@code true} if the list contains the element,
     *         {@code false} otherwise
     * @throws NullPointerException if the specified element is {@code null}
     */
    boolean contains(ElemType element);

    /**
     * Returns the index of the first occurrence of the element in the list,
     * or -1 if the list does not contain the element.
     *
     * Equality is determined using the {@code equals()} method of the elements.
     *
     * @param element the element to search for
     * @return the index of the first occurrence of the element if found, or -1
     * @throws NullPointerException if the specified element is {@code null}
     */
    int indexOf(ElemType element);
}