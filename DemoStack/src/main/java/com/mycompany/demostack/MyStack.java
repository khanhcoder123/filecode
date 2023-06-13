/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demostack;

/**
 *
 * @author khanh
 */
public class MyStack {
  //Khai báo mảng các phần tử
    //top để trỏ đến phần tử trên cùng, max là kích thước ngăn xếp
    public Node[] a;
    int top, max;

    public MyStack(int max) {
        top =-1;
        this.max = max;
        a = new Node[max];
    }
    //Phương thức kiểm tra ngăn xếp rỗng?
    public boolean isEmpty(){
        if(top == -1 ){
            return true;
        }
        else{
            return false;
        }}
    //Phương thức kiếm tra ngăn xếp đầy?
    public boolean isFull(){
        if(top == max-1){
            return true;
        }
        else{
            return false;
        }
    }
    //Phương thức push
    public void push(Node x){
        //Nếu ngăn xếp đầy --> hiển thị thông báo lỗi
        //Ngược lại a[top] = x
        if(isFull()){
            System.out.println("Ngăn xếp đầy, ko push được");}
        else{
            top++;
            a[top] = x;
        }}
    //Phương thức pop
    public Node pop(){
        if(isEmpty()){
            System.out.println("Ngăn xếp rỗng");
            return null;
        }else{
            Node node = a[top];
            top--;
            return node;
        }}
    //Phương thức topEl
    public Node topEl(){
        if(isEmpty()){
           System.out.println("Ngăn xếp rỗng");
            return null;
        }
        else
        {
             Node x = a[top];
            return x;
        }
           
    }
    //Phương thức duyệt các phần tử của mảng a
    public void print(){
        for (int i = 0; i <=top; i++) {
            a[i].printInfo();
        }
    }
}
