package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
  public static void main(String[] args) {

    int quota = 10;

    System.out.println("How many sales do you get this week?");
    Scanner scanner = new Scanner(System.in);
    int sales = scanner.nextInt();
    scanner.close();

    if (sales > quota) {
      System.out.println("Congrats! You met this week's quota!");
      ;
    } else {
      int salesShort = quota - sales;
      System.out.println("I'm sorry, please work harder! You were " + salesShort + " sales short");
    }

  }
}
