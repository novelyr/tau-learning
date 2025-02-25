package learnjava.chapter3;

import java.util.Scanner;

/*
 * Logical Operator:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

public class LogicalOperatorLoanQualifier {

  public static void main(String[] args) {

    // Initialize what we know

    int reqSalary = 30000;
    int reqJobExp = 2;

    // Get what we don't
    System.out.println("What is your salary in a year");
    Scanner scanner = new Scanner(System.in);
    double salary = scanner.nextInt(); // handle both int and decimal numbers

    System.out.println("How many years have you worked?");
    double jobExp = scanner.nextInt();

    scanner.close();

    // Make decision
    if (salary >= reqSalary && jobExp >= reqJobExp) {
      System.out.println("Your loan is granted!");
    } else {
      System.out.println("I'm sorry, you need to make at least $" + reqSalary + " a year and to work at least for "
          + reqJobExp + " years to be qualified");
    }

  }

}
