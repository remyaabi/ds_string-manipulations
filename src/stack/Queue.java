package stack;

import stack.Interface.IQueue;

/**
 * Created by Remya on 1/12/2018.
 */
public class Queue implements IQueue{
    private Node first,last;
    private class Node{
        int item;
        Node next;
    }
    @Override
    public boolean isEmpty() {
        return first==null;
    }
    @Override
    public void enqueue(int element) {
     if(isEmpty()){
         last=new Node();
         last.item=element;
         first=last;
     }else{
         Node oldLast=last;
         last=new Node();
         last.item=element;
         oldLast.next=last;
         last.next=null;
     }
    }
    @Override
    public int dequeue() {
        int item=0;
      if(!isEmpty()){
         item=first.item;
          first=first.next;
      }else{
          last=null;
      }
       return item;
    }
    public static void main(String args[]){
        Queue queue=new Queue();
        queue.enqueue(40);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(10);
        System.out.println("The dequed item :" + queue.dequeue());
        System.out.println("The dequed item :" + queue.dequeue());
        System.out.println("The dequed item :" +queue.dequeue());
        System.out.println("The dequed item :" +queue.dequeue());

    }
}
