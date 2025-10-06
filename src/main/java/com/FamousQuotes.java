package com;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            try {
                Scanner Famousquotes = new Scanner(System.in);

                String[] quotes = {
                        "Just do it.",
                        "You got this.",
                        "You're the apple of my eye",

                        System.out.println("Please select a quote (Enter 0-2): ")};

                int index = Famousquotes.nextInt();
                System.out.println(quotes[index]);


                run = false;
            } catch (Exception e) {

                System.out.println(e.getMessage());
                System.out.println("Issue selecting quote, try again");
            }
            }
        }
    }