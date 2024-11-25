package com.ambiguousdino.app;

import com.ambiguousdino.datastructures.implementation.list.DsaArrayList;
import com.ambiguousdino.datastructures.implementation.list.DsaLinkedList;
import com.ambiguousdino.datastructures.implementation.tree.DsaBinarySearchTree;
import com.ambiguousdino.datastructures.implementation.tree.DsaMaxHeap;
import com.ambiguousdino.datastructures.implementation.tree.DsaMinHeap;

/**
 * Runner app for instantiating and using data structures and algorithms.
 */
@SuppressWarnings("unused")
public class DsaApp {

    /**
     * This class is meant for running the main method; do not instantiate.
     */
    private DsaApp() {
        throw new UnsupportedOperationException("This class is meant for running the main method; do not instantiate.");
    }

    /**
     * The entry point for the application.
     *
     * @param args the command-line arguments passed to the program
     */
    public static void main(String[] args) {
        System.out.println("Starting");

        var linkedlist = new DsaLinkedList<Object>();

        var arraylist = new DsaArrayList<Object>();

        var bst = new DsaBinarySearchTree<Object>();

        var minheap = new DsaMinHeap<Object>();

        var maxheap = new DsaMaxHeap<Object>();

        System.out.println("Finishing");
    }
}
