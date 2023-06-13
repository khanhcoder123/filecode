/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.demostack;

/**
 *
 * @author khanh
 */


public class DemoStack {
    public static void main(String[] args) {
        MyStack ms = new MyStack(5);
        ms.push(new Node(2));
        ms.push(new Node(3));
        ms.push(new Node(5));
        ms.push(new Node(7));
        ms.push(new Node(9));
        ms.push(new Node(12));
        decToBin(10, ms);
    }

    public static void decToBin(int k, MyStack ms) {
        MyStack s = new MyStack(10);
        System.out.println(k + " in binary system is: ");
        while (k > 0) {
            s.push(new Node(k % 2));
            k = k / 2;
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
        System.out.println();
        System.out.println("ngan xep ban dau");
        ms.print();
        System.out.println("ngan xep khi push them");
        ms.push(new Node(12));
        System.out.println("pt tren cung");
        Node x = ms.topEl();
        x.printInfo();
        System.out.println("ngan xep khi lay ra 1 phan tu");
        Node y = ms.pop();
        ms.print();
        System.out.println("phan tu lay ra");
        y.printInfo();
    }
}
