package learnjava.chapter4;

import java.util.Scanner;

public class ForLoop {
  public static void main(String[] args) {
    quantityForLoop();

  }

  public static void quantityForLoop() {
    System.out.println("Enter the number of items that you want to scan?");

    Scanner scanner = new Scanner(System.in);
    int quantity = scanner.nextInt();

    double total = 0;

    for (int i = 1; i <= quantity; i++) {
      System.out.println("Input the product-" + i + " price: ");
      double price = scanner.nextDouble();
      total += price;
    }
    scanner.close();

    System.out.println("Your total is $" + total);

  }

  public static void LetterSearch() {
    System.out.println("Enter some text:");
    Scanner scanner = new Scanner(System.in);
    String text = scanner.next();
    scanner.close();

    boolean letterFound = false;

    // Search text for letter A
    for (int i = 0; i < text.length(); i++) {
      char currentLetter = text.charAt(i);
      if (currentLetter == 'A' || currentLetter == 'a') {
        letterFound = true;
        break;
      }
    }

    if (letterFound) {
      System.out.println("This text contains the letter 'A'");
    } else {
      System.out.println("This text does not contain the letter 'A'");
    }

  }
}
