package learnjava.chapter3;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

public class NestedIf {

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
    if (salary >= reqSalary) {
      if (jobExp >= reqJobExp) {
        System.out.println("Your loan is granted!");
      } else {
        System.out.println("I'm sorry, you need to work at least for " + reqJobExp + " years to be qualified.");
      }
    } else {
      System.out.println("I'm sorry, you need to make at least $" + reqSalary + " a year to be qualified");
    }

  }

}
