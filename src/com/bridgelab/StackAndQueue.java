package com.bridgelab;

// UC4 - Ability to dequeue from the beginning

import java.util.LinkedList;

public class StackAndQueue {

    static LinkedList<String> ll = new LinkedList<>();

    public static void enQueue(String data){
        ll.add(data);
    }

    public static void deQueue(){
        ll.removeLast();
    }
    public static void print(){
        if(ll.size() != 0) {
            for (String element : ll) {
                System.out.print("| " + element + " | ");
            }
            System.out.println();
        } else
            System.out.println("Queue is Null.............");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Stack and Queue Problems...");
        enQueue("56");
        enQueue("30");
        enQueue("70");
        enQueue("70");
        enQueue("70");
        enQueue("70");
        System.out.println("Queue :::::::::::::::::::::");
        print();
        int size = ll.size();
        System.out.println("size " +ll.size());
        for (int i = 0; i < size; i++){
            deQueue();
        }
        System.out.println("Queue :::::::::::::::::::::");
        print();
    }
}
