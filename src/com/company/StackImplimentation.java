package com.company;

public class StackImplimentation {

    int top;
    int[] array;
    public static final int maxCapacity = 1000; // Maximum size of Stack

    StackImplimentation() {

        top = -1;
        array = new int[maxCapacity];
    }

    private boolean isEmply() {
        return top <= -1;
    }

    private boolean isFull() {
        return top >= (maxCapacity - 1);
    }

    public boolean push(int data) {

        if (isFull()) {
            System.out.println("Stack Overflow.");
            return false;
        }
        array[++top] = data;
        return true;

    }

    public int pop() {

        if (isEmply()) {
            System.out.println("Stack Underflow");
            return Integer.parseInt(null);
        }
        int data = array[top--];
        return data;

    }


    public static void main(String args[]) {

        StackImplimentation s = new StackImplimentation();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
    }

}
