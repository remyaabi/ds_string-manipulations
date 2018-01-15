package stack;

import stack.Interface.IStack;

/**
 * Created by elaine on 1/10/2018.
 */
public class LinkedStack<T> implements IStack<T> {
    private Node<T> first = null;
    private class Node<T> {
        T item;
        Node next;
    }
    @Override
    public void push(T element) throws Exception {
        if(first==null){
            first=new Node();
            first.item=element;
        }else {
            Node oldFirst = first;
           first = new Node();
            first.item = element;
            first.next = oldFirst;
        }

    }

    @Override
    public T pop() throws Exception {
        T item = null;
       if(first!=null) {
          item = first.item;
           first = first.next;
       }
        return item;
    }

    @Override
    public boolean isEmpty() {
        return first.next==null;
    }

    @Override
    public int size() {
        return 0;
    }
}
