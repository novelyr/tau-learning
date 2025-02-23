package chapter3;

import java.util.Scanner;

public class TestResult {

  public static void main(String[] args) {
    System.out.println("What is your test result? (0-100)");
    Scanner scanner = new Scanner(System.in);
    double testResult = scanner.nextDouble();
    scanner.close();

    char grade;

    if (testResult > 80) {
      grade = 'A';
    } else if (testResult > 70) {
      grade = 'B';

    } else if (testResult > 60) {
      grade = 'C';

    } else if (testResult > 50) {
      grade = 'D';
    } else {
      grade = 'E';
    }

    System.out.println("Your grade is " + grade);

  }
}
