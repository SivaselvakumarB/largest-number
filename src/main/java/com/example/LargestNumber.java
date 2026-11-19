package com.example;

public class LargestNumber {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
        System.out.println("Third Number: " + c);

        if (a >= b && a >= c) {
            System.out.println("Largest Number: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest Number: " + b);
        } else {
            System.out.println("Largest Number: " + c);
        }
    }
}
