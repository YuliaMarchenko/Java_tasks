package com.company;

import java.util.Scanner;

public class GameGuessNumber {
    private Scanner scanner;
    private int secret;

    public GameGuessNumber(Scanner scanner, int secret) {
        this.scanner = scanner;
        this.secret = secret;
    }

    public int readNumberOfAttempts(){
        System.out.println("Enter numbers of attempts");
        return scanner.nextInt();
    }

    public int readNumber(){
        System.out.println("Enter secret number");
        return scanner.nextInt();
    }

    public void guessNumber(){
        int attempts = readNumberOfAttempts();
        while (attempts >0){
            int number = readNumber();
            if (number == secret) {
                System.out.println("You win!");
                return;
            } else {
                attempts--;
                System.out.println("Try again");
            }
        }
        System.out.println("You lose");
    }
}


