package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Queue followed to FIFO

        Queue<Integer> queue=new LinkedList<>();
        //Add the Element
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        //See Peek element
        System.out.println(queue.peek());

        //Removes the elements
        System.out.println(queue.poll());
    }
}