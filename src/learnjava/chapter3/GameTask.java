package learnjava.chapter3;

import java.util.Scanner;

/*
 *So, you're going to create a program that asks the user to enter the quantities for the following coins.

You'll ask them how many pennies would you like?
How many nickels would you like?
How many dimes?
And then, how many quarters?
What your program is going to do is count up the value of all of the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, tell them how much they went under.
Feel free to change this game for your country's currency, so if you don't use dollars and you use something else that's fine.

So, for an example of this let's say that I ask the user:

How many pennies? - And they said 0.
How many nickels? - 0
How many dimes? - 0
How many quarters? - 4
Then my program would know that, okay quarters are worth 25 cents. There's 4 of these, let me multiply those and get the value. Oh! that equals one dollar, so I let them know that they win. So that's an example of the game.

Good luck!

Solution
 */

public class GameTask {

  public static void main(String[] args) {

    int targetMoney = 100; // in cents
    int pennies = 1; // in cents
    int nickels = 5; // in cents
    int dimes = 10; // in cents
    int quarters = 25; // in cents
    int total;
    int difference;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to 'Change for a Dollar'! " +
        "Your goal is to enter enough change to make exactly $1.00");

    System.out.println("How many pennies would you like?");
    int penniesAmount = scanner.nextInt();
    System.out.println("How many nickels would you like?");
    int nickelsAmount = scanner.nextInt();
    System.out.println("How many dimes would you like?");
    int dimesAmount = scanner.nextInt();
    System.out.println("How many quarters would you like?");
    int quartersAmount = scanner.nextInt();
    scanner.close();

    total = penniesAmount * pennies + nickelsAmount * nickels + dimesAmount * dimes + quartersAmount * quarters;

    if (total < targetMoney) {
      difference = targetMoney - total;
      System.out.println("Oh no it is less than 1 dollar, you went under by " + difference + " cents");
    } else if (total > targetMoney) {
      difference = total - targetMoney;
      System.out.println("Oh no it is more than 1 dollar, you went over by " + difference + " cents");
    } else {
      System.out.println("Your change is exactly $1.00! You Win!");
    }

  }
}
