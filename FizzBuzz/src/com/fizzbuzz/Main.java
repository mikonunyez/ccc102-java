package com.fizzbuzz;

// Instructions
// Read a number
// If divisible by 5, return Fizz
// If divisible by 3, return Buzz
// If divisible by both 3 and 5, return FizzBuzz
// if not divisible by either 3 or 5, return the number

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = userInput.nextInt();

        if (num%3 == 0 && num%5 == 0){
            System.out.println("FizzBuzz");
        }
        else if (num%3 == 0){
            System.out.println("Buzz");
        }
        else if (num%5 == 0){
            System.out.println("Fizz");
        }
        else{
            System.out.println(num);
        }
    }
}
