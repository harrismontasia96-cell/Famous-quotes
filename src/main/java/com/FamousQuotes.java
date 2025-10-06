package com;
import java.util.Scanner;
import java.util.InputMismatchException;

public class FamousQuotes {
    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            try {
                Scanner FamousQuotes = new Scanner(System.in);

                String[] quotes = {
                        "Just do it.",
                        "You got this.",
                        "You're the apple of my eye",
                };

                System.out.println("Please select a quote (Enter 0-2): ");

                int index = FamousQuotes.nextInt();
                System.out.println(quotes[index]);


                run = false;
            }
            catch (InputMismatchException e) {

                System.out.println("Please enter numbers only!");
                FamousQuotes.nextLine();
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