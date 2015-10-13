package com.leepengg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionsDemo {
    public static void main(String args[]) {
        // create Linked List
        ArrayList list = new ArrayList();

        // populate list
        list.add(52);
        list.add(27);
        list.add(14);
        list.add(-33);

        System.out.println("List before shuffle: " + list);

        // shuffle the list
        Collections.shuffle(list);

        System.out.println("List after shuffle: " + list);
    }
}