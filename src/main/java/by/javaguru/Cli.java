package by.javaguru;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner console = new Scanner(System.in);
        String username = console.nextLine();
        System.out.println(STR."Hello, \{username} !");
    }
}
