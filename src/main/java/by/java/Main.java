package by.java;

import java.util.Scanner;
import by.java.games.PrimeGame;
import by.java.games.CalcGame;
import by.java.games.GcdGame;
import by.java.games.ProgressionGame;
import by.java.games.EvenGame;

public class Main {
    private static final String GREET = "1";
    private static final String EVEN = "2";
    private static final String CALC = "3";
    private static final String GCD = "4";
    private static final String PROGRESSION = "5";
    private static final String PRIME = "6";
    private static final String EXIT = "0";

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc ");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner console = new Scanner(System.in);
        String selectionGame = console.nextLine();
        switch (selectionGame) {
            case GREET -> Cli.greeting();
            case EVEN -> EvenGame.startGame();
            case CALC -> CalcGame.startGame();
            case GCD -> GcdGame.startGame();
            case PROGRESSION -> ProgressionGame.startGame();
            case PRIME -> PrimeGame.startGame();
            case EXIT -> System.out.println("Goodbye!");
            default -> throw new IllegalStateException(STR."Unexpected values\{selectionGame}");
        }
    }
}