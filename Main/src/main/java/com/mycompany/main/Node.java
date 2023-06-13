/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author khanh
 */
public class Node {
    Student info;
    Node next;

    public Node(Student info) {
        this.info = info;
        this.next = null;
    }

    public void printData() {
        info.printInfo();
    }
    public boolean hasStudent(int studentId) {
        return this.info.getStudentId() == studentId;
    }
}
