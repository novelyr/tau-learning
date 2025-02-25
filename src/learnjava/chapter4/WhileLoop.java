package learnjava.chapter4;

import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    int rate = 15; // dollar per hour
    int maxHours = 40;

    double workWeek;
    System.out.println("How many hours do you work this week?");
    Scanner scanner = new Scanner(System.in);
    workWeek = scanner.nextDouble();

    while (workWeek > maxHours) {
      System.out.println("Invalid input. Work week must between 1 - 40. Try again: ");
      workWeek = scanner.nextDouble(); // to exit infinity loop
    }
    scanner.close();

    double wage = workWeek * rate;
    System.out.println("You earn $" + wage + " this week");

  }
}
