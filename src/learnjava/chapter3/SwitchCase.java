package learnjava.chapter3;

import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
    System.out.println("Enter your letter grade: ");
    Scanner scanner = new Scanner(System.in);
    String grade = scanner.next();
    scanner.close();

    // String message;

    // switch (grade) {
    // case "A":
    // case "a":
    // message = "Excellent job!";
    // break;
    // case "B":
    // case "b":
    // message = "Great job!";
    // break;
    // case "C":
    // case "c":
    // message = "Good Job!";
    // break;
    // case "D":
    // case "d":
    // message = "Work Harder!";
    // break;
    // case "E":
    // case "e":
    // message = "This is bad!";
    // break;
    // default:
    // message = "The grade is invalid!";
    // break;
    // }

    String message = switch (grade) {
      case "A", "a" -> "Excellent job!";
      case "B", "b" -> "Great job!";
      case "C", "c" -> "Good Job!";
      case "D", "d" -> "Work Harder!";
      case "E", "e" -> "This is bad!";
      default -> "The grade is invalid!";
    };

    System.out.println(message);
  }
}
