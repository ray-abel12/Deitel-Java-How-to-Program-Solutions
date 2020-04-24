package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userInput = " ";
        while (true)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter 5 digit long number");
            userInput = scan.nextLine();
            if(userInput.length() < 5) {
                System.out.println("mistake!! try again ");
                continue;
            }
            boolean isResult = isPalindrome(userInput);
            String message = isResult? "Palindrome":"is Not Palindrome";
            System.out.println(message);
            break;
        }


    }

    public static boolean isPalindrome(String userInput){
        if((userInput.charAt(0) == userInput.charAt(4)) && (userInput.charAt(1) == userInput.charAt(3)))
            return true;
        return false;
    }
}

