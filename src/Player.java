/*
* Author: Luís Felipe
* This class going to create the player and your methods.
*/

import java.util.Scanner;

public class Player {

    /*
    * Creating the variable that say the remaining attempts.
    */
    private int remainingAttempts;

    /*
    * Creating the constructor that receive the variable remaining attempts
    */
    public Player(int remainingAttempts) {
        this.remainingAttempts = remainingAttempts;
    }

    /*
    * This method going to take a letter of the user and put it in the word
    * and so return the letter.
    * */
    public char makePlay() {
        System.out.println("Type a letter: ");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().toUpperCase().charAt(0);
        return letter;
    }

    /*
    * This method reduce the attempts.
    */
    public void reduceAttempts() {
        remainingAttempts--;
    }

    /*
    * This method get the remaining attempts.
    */
    public int getRemainingAttempts() {
        return remainingAttempts;
    }
}
