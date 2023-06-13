/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demoqueue;

/**
 *
 * @author khanh
 */
public class DemoQueue {

    public static void main(String[] args) {
        MyQueue mq = new MyQueue(5);
        mq.enqueue(new Node(2));
        mq.enqueue(new Node(4));
        mq.enqueue(new Node(6));
        mq.enqueue(new Node(8));
        mq.enqueue(new Node(10));

    System.out.println("Elements in the queue:");
    mq.print();

    if (!mq.isEmpty()) {
        Node removedNode = mq.dequeue();
        System.out.println("Dequeued element: " + removedNode.getValue());
        mq.print();
    } else {
        System.out.println("Queue is empty. Cannot dequeue an element.");
    }
    
    /*if (!mq.isFull()) {
        mq.enqueue(new Node(6));
        System.out.println("Enqueued a new element:");
        mq.print();
    } else {
        System.out.println("Queue is full. Cannot enqueue a new element.");
    }*/
    }
}
