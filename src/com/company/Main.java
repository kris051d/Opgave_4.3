package com.company;

public class Main {

    //the program is at the 6th state when it first invoked "ping"


    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }
    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }
    public static void baffle() {
        System.out.print("wug");
        ping();
    }
    public static void ping() {
        System.out.println(".");
    }
}
//No, I wug.
//You wugga wug.
//I wug.