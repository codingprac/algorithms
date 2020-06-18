package com.d3.prac.recursion;

import java.util.Stack;

public class TowersOfHanoi {

    void move(Stack<Integer> origin, Stack<Integer> destination) {
        int num = origin.pop();
        if (!destination.isEmpty() && destination.peek() <= num) {
            System.out.println("Error Placing Disk: " + num);
        } else {
            //System.out.println("Moving disk " + num + " from: " + origin.getClass().getSimpleName() + " to " + destination.getClass().getSimpleName());
            destination.push(num);
        }
    }

    void moveDisks(int n, Stack<Integer> origin, Stack<Integer> buffer, Stack<Integer> destination) {
        if (n > 0) {
            moveDisks(n - 1, origin, destination, buffer);
            move(origin, destination);
            moveDisks(n - 1, buffer, origin, destination);
        }
    }

    public static void main(String[] args) {

        int n = 3;

        Stack<Integer> A = new Stack();
        Stack<Integer> B = new Stack();
        Stack<Integer> C = new Stack();

        A.push(3);
        A.push(2);
        A.push(1);

        TowersOfHanoi toh = new TowersOfHanoi();
        toh.moveDisks(n, A, B, C);

        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
    }

}

