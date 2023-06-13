/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maincux;

/**
 *
 * @author khanh
 */
public class MyList {
    private Node head;
    private Node tail;

    public MyList() {
        head = tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    //addfirst
    public void addFirst(Node node) {
    if (isEmpty()) {
        head = tail = node;
    } else {
        node.next = head;
        head = node;
    }
}
    //add last
    public void add(Node node) {
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }
    //Add at
    public void addAt (int position, Node node){
    if (position == 1){
    node.next = head;
    head = node;
    } else{
    Node previousNode = head;
    int count = 1;
    while (count < position -1 && previousNode.next != null){
    previousNode = previousNode.next;
    count++;
    }
    node.next = previousNode.next;
    previousNode.next = node;
    
        }
}
    public void deleteFirst() {
        if (isEmpty()) {
            return;
        }if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
   public void deleteLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        tail = current;
    }
    public void deleteAt(int index) {
        if (index < 0 || head == null) {
            return;
        }
        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }
        Node previous = getNodeAtIndex(index - 1);
        if (previous == null || previous.next == null) {
            return;
        }

        Node nodeToDelete = previous.next;
        previous.next = nodeToDelete.next;

        if (previous.next == null) {
            tail = previous;
        }
    }

    private Node getNodeAtIndex(int index) {
        if (index < 0 || head == null) {
            return null;
        }

        Node current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }

        return current;
    }
    public void traverse() {
        Node currentNode = head;
        while (currentNode != null) {
            currentNode.printData();
            currentNode = currentNode.next;
        }
    }
}