package learnjava.chapter4;
/*
The objective of this game is to travel the entire game board of 20 spaces within 5 dice rolls.

Roll the dice for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board. Here’s the code to do this ((import is java.util.Random):


After each roll, tell the user which game space they are on and how many more spaces they have to go to win.

Repeat this 4 additional times, for 5 rolls in total.

However, if the user gets to 20 before 5 rolls, end the game - they’ve won.

If they are greater than or less than 20 spaces exactly, they lose.

Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug. */

import java.util.Random;

public class DiceGameTask {

  public static void main(String[] args) {
    int gameBoard = 20;
    Random random = new Random();
    int positionNow = 0; // start from 0
    int numberOfRolls = 6;
    int remainedPositions = 0;

    for (int i = 1; i <= numberOfRolls; i++) {
      int dice = random.nextInt(6) + 1;
      positionNow += dice;
      remainedPositions = gameBoard - positionNow;
      if (positionNow < gameBoard && i == numberOfRolls) {
        System.out
            .println("Roll #" + (i) + ": You've rolled a " + dice
                + ". YOU LOST! You run out of rolls! You are now on space " + positionNow + " and have "
                + remainedPositions + " more to go.");
      } else if (positionNow < gameBoard) {
        System.out
            .println("Roll #" + (i) + ": You've rolled a " + dice
                + ". You are now on space " + positionNow + " and have " + remainedPositions + " more to go.");

      } else if (positionNow > gameBoard) {
        System.out
            .println("Roll #" + (i) + ": You've rolled a " + dice
                + ". You run out off space!. You passed " + (positionNow - gameBoard) + " spaces.");
        break;
      } else if (positionNow == gameBoard) {
        System.out
            .println("Roll #" + (i) + ": You've rolled a " + dice
                + ". Congrats! You win! It is exactly at 20 space!");
        break;
      }
    }
  }
}
