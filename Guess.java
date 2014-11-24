package Lab6;
//************************************************************
//Guess.java
//
//Play a game where the user guesses a number from 1 to 10
//
//************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess {
 public static void main(String[] args) {
     int numToGuess; // Number the user tries to guess
     int guess; // The user's guess
     int highGuesses = 0;
     int lowGuesses = 0;
     final int max = 10;
     Scanner scan = new Scanner(System.in);
     Random generator = new Random();
     // randomly generate the number to guess
     numToGuess = generator.nextInt(max) + 1;
     // print message asking user to enter a guess
     System.out.println("Lets see if you're psychic!");
     System.out.println("Pick a number between 1 and 10: ");
     guess = scan.nextInt();
     while (guess != numToGuess) // keep going as long as the guess is wrong
     {
         if (guess > numToGuess) { //finds out if guess was too high or low
             System.out.println("You went too high.");
             highGuesses += 1; 
         } else {
             System.out.println("You went too low.");
             lowGuesses += 1; 
         }
         // gets another guess from the user
         System.out.println("Pick a number between 1 and 10: ");
         guess = scan.nextInt();
     }
     System.out.println("You're right!");
     // Prints out the number of guesses. (adds one the total to account for the correct guess)
     System.out.println("It only took you " + ((highGuesses + lowGuesses) + 1) + " guesses!");
     System.out.println(highGuesses + " guesses were too high");
     System.out.println(lowGuesses + " guesses were too low");
     scan.close();
 }
}