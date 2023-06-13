/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demoqueue;

/**
 *
 * @author khanh
 */
public class MyQueue {

   public int max;
   public int first, last;
   Node[] a;

    public MyQueue(int max) {
       
        this.max = max;
        a = new Node[max];
        first = last =-1;
    }
   //Phương thức kiểm tra hàng đợi đầy
    public boolean isFull(){
        return (first ==0&& last == max-1);
    }
   //Phương thức kiểm tra hàng đợi rỗng
   
   public boolean isEmpty(){
       return (first ==-1);
   }
public Node dequeue() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return null;
    } else {
        Node node = a[first];
        if (first == last) {
            // Reset indices if the queue becomes empty after dequeue
            first = -1;
            last = -1;
        } else {
            first = (first + 1) % max;  // Wrap around to the beginning if reaching the end
        }
        return node;
    }
}
   //Phương thức enqueue để đưa 1 phần tử vào hàng đợi
   //Kiểm tra hàng đợi đầy hay chưa?
  //Tăng last lên, đưa phần tử vào a[last]
    public void enqueue(Node x) {
    if (isFull()) {
        System.out.println("Queue is full");
    } else {
        if (isEmpty()) {
            first = 0;  // Update the first index if the queue was empty
        }
        last = (last + 1) % max;  // Wrap around to the beginning if reaching the end
        a[last] = x;
    }
}
    public void print(){
        //Duyệt mảng và in ra các phần tử của mảng
        for (int i = 0; i < max; i++) {
            if(a[i] !=null){
                a[i].printInfo();
            }
        }
    }
   
    
}



