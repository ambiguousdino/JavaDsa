package com.ambiguousdino.datastructures.implementation.list;

import com.ambiguousdino.datastructures.api.DsaList;

/**
 * Implementation of a linked list.
 * 
 * @param <ElemType> the type of element stored in this list.
 */
public class DsaLinkedList<ElemType> implements DsaList<ElemType> {

    /**
     * Private helper class to store nodes in the list
     */
    private static class Node<ElemType> {
        ElemType data;
        Node<ElemType> next;

        Node(ElemType data) {
            this.data = data;
            this.next = null;
        }
    }

    Node<ElemType> head;
    Node<ElemType> tail;

    /**
     * Creates an instance of a linked list
     */
    public DsaLinkedList() {

    }

    @Override
    public void add(ElemType element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public ElemType get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public boolean remove(ElemType element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public boolean contains(ElemType element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public int indexOf(ElemType element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

}
