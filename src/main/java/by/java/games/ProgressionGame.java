package by.java.games;

import by.java.Engine;
import by.java.Utils;

public class ProgressionGame {
    private static final int MIN = 0;
    private static final int MAX = 50;
    private static final int MAX_STEP = 5;
    private static final int PROGRESSION_LENGTH = 8;

    public static String[] generateRoundData() {
        var step = Utils.randomGenerator(MIN, MAX_STEP);
        var firstNumber = Utils.randomGenerator(MIN, MAX);
        int hiddenNumber = Utils.randomGenerator(0, PROGRESSION_LENGTH - 1);
        String[] progression = generateProgression(firstNumber, step, PROGRESSION_LENGTH);
        var correctAnswer = progression[hiddenNumber];
        progression[hiddenNumber] = "..";
        var questions = String.join(" ", progression);
        return new String[]{questions, correctAnswer};
    }

    public static void startGame() {
        String gameRules = "What number is missing in the progression?";
        var questionsAnswer = new String[Engine.QUESTIONS_COUNT][2];
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            questionsAnswer[i] = generateRoundData();
        }
        Engine.launchGame(gameRules, questionsAnswer);
    }

    public static String[] generateProgression(int number, int step, int progressionLength) {
        String[] progression = new String[progressionLength];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = Integer.toString(number);
            number += step;
        }
        return progression;
    }
}
