package chapter2;

import java.util.Scanner;

public class task {
  public static void main(String[] args) {
    System.out.println("Enter today season");
    Scanner scanner = new Scanner(System.in);
    var season = scanner.next();

    System.out.println("Enter a whole number");
    var number = scanner.nextInt();

    System.out.println("Enter an adjective");
    var adjective = scanner.next();
    scanner.close();

    System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
  }
}
