package learnjava.chapter4;

import java.util.Scanner;

public class DoWhile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int total = 0;
    int number;

    do {
      System.out.println("Input a number to be added: (input 0 to end operation)");
      number = scanner.nextInt();
      total += number;
      System.out.println("Your total for now is " + total);

    } while (!(number == 0));

    System.out.println("Your grand total is " + total);

    scanner.close();
  }
}
