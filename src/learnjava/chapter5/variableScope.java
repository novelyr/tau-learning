package learnjava.chapter5;

import java.util.Scanner;

public class variableScope {
  static int requiredSalary = 25000;
  static int requiredCreditScore = 700;
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Double salary = getSalary();
    Double creditScore = getCreditScore();
    scanner.close();

    boolean qualified = isQualified(salary, creditScore);
    notify(qualified);
  }

  public static Double getSalary() {
    System.out.println("Enter your salary");
    Double salary = scanner.nextDouble();

    return salary;
  }

  public static Double getCreditScore() {
    System.out.println("Enter your credit score");
    Double creditScore = scanner.nextDouble();

    return creditScore;
  }

  public static boolean isQualified(Double salary, Double creditScore) {
    if (salary > requiredSalary && creditScore > requiredCreditScore) {
      return true;
    } else {
      return false;
    }
  }

  public static void notify(boolean bool) {
    if (bool) {

      System.out.println("You are qualified");
    } else {
      System.out.println("You are not qualified");
    }

  }
}
