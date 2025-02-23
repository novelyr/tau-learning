package chapter3;

import java.util.Scanner;

public class GradeMessage {
  public static void main(String[] args) {
    System.out.println("Enter your letter grade: ");
    Scanner scanner = new Scanner(System.in);
    String grade = scanner.next();
    scanner.close();

    String message;

    switch (grade) {
      case "A":
        message = "Excellen job!";
    }
  }
}
