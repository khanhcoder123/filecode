/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author khanh
 */
public class MyList {
    private Node head;
    private Node tail;
    private Student node3;

    public MyList() {

        head = tail = null;
    }
    public boolean isEmpty() {
        return head == null;

    }
    //Thêm node
    public void add(Node node) {        
        // chưa có node nào
        if (isEmpty()) {
            head = tail = node;
        } else {
            //Lấy tail móc vào node mới
            //Tail là node mới
            tail.next = node;
            tail = node;
        }
    }
    //Thêm đầu 
    public void addFirst(Node node) {
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }
    //Thêm ở giữa
    public void traverse(){
        //Dùng 1 node làm con trỏ và trỏ từ head đến null
        Node currentNode = head;
        while(currentNode !=null){
            currentNode.printData();
            currentNode = currentNode.next;
        }
    }
}
