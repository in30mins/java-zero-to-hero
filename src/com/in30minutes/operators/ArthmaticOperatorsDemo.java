package com.in30minutes.operators;

public class ArthmaticOperatorsDemo {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = 15;
        byte d = 25;
        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a * b = "+ (a*b));
        System.out.println("a / b = "+ (a/b));
        System.out.println("a % b = "+ (c%a));
        byte a1 = ++a; //pre increment
        byte a2 = a++; // post increment
        byte a3 = --a; // pre decrement
        byte a4 = a--; // post decrement
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
