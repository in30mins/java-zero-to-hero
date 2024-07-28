package com.in30minutes.flowStatement;

public class IfStatementDemo {
    public static void main(String[] args) {

        byte x1 = 23;
        if (x1 <3){
            System.out.println("x1 is less then 32");
        }else {
            System.out.println("x1 is greaterthen 32");
        }
        //int b = (x>4)? System.out.println("x is less then 32"):System.out.println("x is greaterthen 32");
        int x=69;
        int y=89;
        int z=79;
        int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("The largest numbers is:  "+largestNumber);
    }
}
