/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maincux;

/**
 *
 * @author khanh
 */
public class Maincux {

    public static void main(String[] args) {
        MyList ml = new MyList();
       
        Student s1 = new Student(1,"Thuy", 20);
        Student s2 = new Student(2, "Hoang Anh", 19);
        Student s3 = new Student(3, "Phuc", 20);
        Student s4 = new Student(4, "Thang",20);
        Student s6 = new Student(5, "Thang",20);
        Node node1 = new Node(s1);
        Node node2 = new Node(s2);
        Node node3 = new Node(s3);
        Node node4 = new Node(s4);
        Node node6 = new Node(s6);
        //theem
        ml.add(node1);
        ml.add(node2);
        ml.add(node3);
        ml.add(node4);
        ml.add(node6);
        //Them dau
        ml.addFirst(node1);
        //them giua
        ml.addAt(2, node4);
         ml.addAt(1, node6);
        //xoa dau
        ml.deleteFirst();
        //xoa giua
        int indexToDelete = 2;
        ml.deleteAt(indexToDelete);
        //xoa cuoi
        ml.deleteLast();
        ml.traverse();
    }    
}

