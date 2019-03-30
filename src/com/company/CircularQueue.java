package com.company;

public class CircularQueue {

    int head;
    int tail;
    int[] array;
    int capicity = 3;

    CircularQueue() {
        head = -1;
        tail = -1;
        array = new int[capicity];
    }

    CircularQueue(int capicity) {
        head = -1;
        tail = -1;
        array = new int[capicity];
    }

    private boolean isFull() {

        return (head == 0 && tail == (capicity - 1)) || (tail + 1 == head);
    }

    private boolean isEmpty() {
        return head == -1 && tail == -1;
    }

    public void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        } else if (isEmpty()) { // insert first element.
            head = tail = 0;
            array[head] = data;
            return;

        } else if (tail == capicity - 1 && head != 0) {
            tail = 0;
            array[tail] = data;
            return;
        }
        array[++tail] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is enpty.");
            return Integer.parseInt(null);
        }
        int data = array[head];
        if (head == (capicity - 1)) {
            head = 0;
        } else if (head == tail) {
            head = -1;
            tail = -1;
        }
        head++;
        return data;

    }

    public void display() {
        if (head == -1) {
            System.out.println("Queue is Empty.");
            return;
        }
        int tmp = head;
        if (tail < head) {
            while (tmp <= capicity - 1) {
                System.out.println(array[tmp]);
                tmp++;
            }
            tmp = 0;
            while (tmp <= tail) {
                System.out.println(array[tmp]);
                tmp++;
            }
            return;
        }
        while (tmp <= tail) {
            System.out.println(array[tmp]);
            tmp++;
        }
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.display();
        cq.dequeue();
        System.out.println("========");
        cq.display();
        cq.enqueue(5);
        System.out.println("========");
        cq.display();




    }


}
