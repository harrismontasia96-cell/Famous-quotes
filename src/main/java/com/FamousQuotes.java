package com;
import java.util.Scanner;
import java.util.InputMismatchException;

public class FamousQuotes {
    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            try {
                Scanner scanner = new Scanner(System.in);

                String[] quotes = {
                        "Just do it.",
                        "You got this.",
                        "You're the apple of my eye",
                };

                System.out.println("Please select a quote (Enter 0-2): ");

                int index = scanner.nextInt();
                scanner.nextLine();
                System.out.println(quotes[index]);

                System.out.println("do you want to see another quote(yes or no): ");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("no")) {
                    run = false;

                }

            }
            catch (InputMismatchException e) {

                System.out.println("Please enter numbers only!");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("numbers must be between 0 and 2.");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}