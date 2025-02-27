package learnjava.chapter5;

import java.util.Scanner;

public class methodGreetings {
  public static void main(String[] args) {
    System.out.println("May I know your name? Please tell me your name below:");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    scanner.close();
    greetings(name);
  }

  public static void greetings(String name) {
    System.out.println("Hello, nice to meet you " + name);
  }
}
