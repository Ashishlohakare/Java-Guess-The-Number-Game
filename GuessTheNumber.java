package com.company;
import java.util.Random;
import java.util.Scanner;

class NumberGame{
    public int number;
    public int usersInput;
    public int attempts = 0;

    public int getAttempts() {
        return attempts;
    }
    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    NumberGame(){
        Random random = new Random();
        this.number = random.nextInt(100);
    }
    public void heading(){
                System.out.println("\nWelcome to guess the number Game :");
        System.out.println("\nGuess the computer's randomly generated number between 1 and 100 with hints provided based on your input, aiming for the minimum number of guesses.");

    }
    void usersInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        usersInput = sc.nextInt();
        // sc.close();
    }
    boolean isCorrectNumber(){
        attempts++;
        if (usersInput == number) {
            System.out.format("Hureeyee!!! You guessed it right, it was %d \n You took %d attempts", number, attempts);
            return true;
        }
        else if(usersInput<number){
            System.out.println("Your guessed number is slightly on the Lower side. Consider aiming for a higher number in your next guess.");
        }
        else if(usersInput>number){
            System.out.println("Your guessed number is slightly on the higher side. Consider aiming for a lower number in your next guess.");
        }
        return false;
    }
    
}

public class GuessTheNumber {
    public static void main(String[] args) {
        NumberGame Ng = new NumberGame();
        boolean b = false;
        Ng.heading();
        while (!b) {
            Ng.usersInput();
            b = Ng.isCorrectNumber();
        }
        
    }
}
