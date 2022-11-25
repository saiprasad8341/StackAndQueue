package com.bridgelab;

// UC3 - Ability to create a Queue of 56->30->70

import java.util.LinkedList;

public class StackAndQueue {

    static LinkedList<String> ll = new LinkedList<>();

    public static void enQueue(String data){
        ll.add(data);
    }

    public static void pop(){
        ll.removeLast();
    }
    public static void print(){
        if(ll.size() != 0) {
            for (String element : ll) {
                System.out.print("| " + element + " | ");
            }
            System.out.println();
        } else
            System.out.println("Stack is Null.............");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Stack and Queue Problems...");
        enQueue("56");
        enQueue("30");
        enQueue("70");
        enQueue("70");
        enQueue("70");
        enQueue("70");
        System.out.println("Stack :::::::::::::::::::::");
        print();
        int size = ll.size();
        System.out.println("size " +ll.size());
        for (int i = 0; i < size; i++){
            pop();
        }
        System.out.println("Queue :::::::::::::::::::::");
        print();
    }
}
