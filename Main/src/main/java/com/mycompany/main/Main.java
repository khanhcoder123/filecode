/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author khanh
 */
public class Main {

    public static void main(String[] args) {
        MyList ml = new MyList();
       
        Student s1 = new Student(1,"Thủy", 20);
        Student s2 = new Student(2, "Hoàng Anh", 19);
        Student s3 = new Student(3, "Phúc", 20);
        Student s4 = new Student(4, "Thắng",20);
        Student s5 = new Student(5, "Thắng",20);
        Node node1 = new Node(s1);
        Node node2 = new Node(s2);
        Node node3 = new Node(s3);
        Node node4 = new Node(s4);
         Node node5 = new Node(s5);
        ml.add(node1);
        ml.add(node2);
        ml.add(node3);
        ml.add(node4);
        ml.add(node5);
        ml.traverse();
    }
    }
