package com.milesraker;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // a. Tells whether what the user entered is a number
        boolean isNumeric = StringUtils.isNumeric(input);
        if(isNumeric){
            System.out.println(input + " is numeric");
        } else{
            System.out.println(input + " is not numeric");
        }

        // b. Flips the case of the string
        String swappedCaseInput = StringUtils.swapCase(input);
        System.out.println("Case swapped input: ");
        System.out.println(swappedCaseInput);

        // c. Reverses the string
        String reversedInput = StringUtils.reverse(input);
        System.out.println("input in reverse | esrever ni tupni");
        System.out.println(reversedInput);


    }
}