package learnjava.chapter4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedForLoops {
  public static void main(String[] args) throws Exception {
    int studentNumber = 24;
    int numberOfTest = 4;
    Scanner scanner = new Scanner(System.in);
    double totalScore = 0;
    double testScore;
    double averageScore;

    for (int i = 0; i < studentNumber; i++) {
      System.out.println("We are evaluating student number-" + (i + 1));
      for (int j = 0; j < numberOfTest; j++) {
        while (true) {
          try {
            System.out.println("Enter the score of student-" + (i + 1) + " test-" + (j + 1));
            testScore = scanner.nextDouble();
            totalScore += testScore;
            break; // Exit loop only if input is valid
          } catch (InputMismatchException error) {
            System.out.println("❌ Invalid input! Please enter a valid number.");
            scanner.nextLine(); // Clear invalid input
          }

        }
      }
      averageScore = totalScore / numberOfTest;
      System.out.println("The average score of student-" + (i + 1) + " is: " + averageScore);

    }
    scanner.close();
  }
}
