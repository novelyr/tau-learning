package chapter2;

import java.util.Scanner;

public class task {

  // trying getter and setter feature in vscode
  String name;
  String age;

  public String getname() {
    return this.name;
  }

  public void setname(String name) {
    this.name = name;
  }

  public String getage() {
    return this.age;
  }

  public void setage(String age) {
    this.age = age;
  }

  public static void main(String[] args) {
    System.out.println("Enter today season");
    Scanner scanner = new Scanner(System.in);
    var season = scanner.next();

    System.out.println("Enter a whole number");
    var number = scanner.nextInt();

    System.out.println("Enter an adjective");
    var adjective = scanner.next();
    scanner.close();

    System.out
        .println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
  }
}
