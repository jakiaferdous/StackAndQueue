package com.company;

public class QueueImplimentationLinkedList {

    Node head;
    Node tail;

    private boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {

        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void remove() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        if(head.next == null){
            head = tail = null;
            return;
        }
        head = head.next;
    }

    public  void display(){
        if(isEmpty()) {
            System.out.println("Null");
            return;
        }
        Node tmp = head;
        while (tmp != tail){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
        System.out.println(tmp.data);
    }

    public static void main(String[] args) {

        QueueImplimentationLinkedList q = new QueueImplimentationLinkedList();

        q.add(12);
        q.add(14);
        q.add(11);
        q.display();
        System.out.println("==========");
        q.remove();
        q.display();

    }


}
