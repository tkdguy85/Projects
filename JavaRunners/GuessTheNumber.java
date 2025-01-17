package JavaRunners;
import java.util.Scanner;
import java.util.Random;

// Started on Day 4 
// package guessthenumber;

/*  How to play
    1 - Computer picks random #
    2 - User guesses
    3 - Computer gives clues
    4 - User keeps guessing until correct
*/

public class GuessTheNumber {
    
    int theNUMBER;                                                          // This is the # to guess, randomly generated by the computer.
    int max;                                                                // This is the max # the comp can choose.
    Scanner scanner = new Scanner(System.in);                               // This allows keyboard input to be recognized by computer.

    public GuessTheNumber() {
        Random rand = new Random();                                         // Prompt for rand in (rand.nextINT)
        max = 100;                                                          // Max # is set here <---
        theNUMBER = Math.abs(rand.nextInt()) % (max + 1);                   // Random # generated is run through the % operater. Max + 1 eliminates 0 and gets us to 100.
    }

    public void play() {                                                    // This is the function enabling the user to input a #. 
        while (true) {
            int move = scanner.nextInt();                                   // Gets input from terminal
            if (move > theNUMBER) {
                System.out.println("Your number is too big");
            } else if (move < theNUMBER) {                                  // This section should be obvious.
                System.out.println("Your number is too small");
            } else {
                System.out.println("Nailed it!");
                System.out.println("You've impressed me. Try again?");
                break;                                                      // Break stops the looping after the correct answer is guessed.
            }
        }
    }



    // This function determines the size of a number based on ranges
    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {                                            // If (0 <= x <= 10), it's small.
            System.out.println("Our number is pretty small");
        } else if (x >= 11 && x <= 100) {                                   // If (11 <= x <= 100), it's big.
            System.out.println("Our number is pretty big");
        } else {                                                            // This prevents numbers over 100 and other input from throwing errors. Rejects input.
            System.out.println("Our number is out of range");
        }
    }

    public static void main(String[] args) {
        // This is to initiate the game.
        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Good evening Professor Falken. Would you like to play a game?");
        System.out.println("Guess the number between 0 and "+ guessGame.max + ". " + "Please enter a number...");
        guessGame.play();

        
        
        
        
        
        /* This input was used to test 'main' function.
        howBigIsMyNumber(0);
        howBigIsMyNumber(10);
        howBigIsMyNumber(11);
        howBigIsMyNumber(99);
        howBigIsMyNumber(5);
        howBigIsMyNumber(101);
        howBigIsMyNumber(-22); */
    }
}