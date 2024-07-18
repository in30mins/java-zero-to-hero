package com.in30minutes.operators;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        byte a = 34;
        byte b = 21;


        System.out.println((a == b)&&(a !=b));
        System.out.println((a == b)||(a !=b));
        System.out.println(!(a !=b));
    }
}
