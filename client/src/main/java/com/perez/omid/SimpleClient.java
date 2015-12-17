package com.perez.omid;

/**
 * @author perez@
 */
public class SimpleClient implements Client {

    public static void main(String[] args) {
        System.out.println("I'm a client");
    }

    public String get(){
        return "I'm a client";
    }

}
