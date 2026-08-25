package com.app.Working_with_Unary_Operators.Increment_and_Decrement_Operators;

public class Operators {
    public static void main(String[] args) {
        // Preincremento: ++counter
        int counter = 0;
            System.out.println(counter); // Outputs 0
            System.out.println(++counter); // Outputs 1
            System.out.println(counter); // Outputs 1
            System.out.println(counter--); // Outputs 1
            System.out.println(counter); // Outputs 0

        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);

        /*
        int y = 4 * 5 / x-- + --x; // x assigned value of 4
        int y = 4 * 5 / 4 + --x; // x assigned value of 3
        int y = 4 * 5 / 4 + 2; // x assigned value of 2
        */


    }

}
