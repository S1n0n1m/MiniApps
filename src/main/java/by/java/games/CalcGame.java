package by.java.games;

import by.java.Engine;

public class CalcGame {
    private static final int MAX_RANDOM_NUMBER = 10;
    public static String[] generateRoundData() {
        char[] mathOperators = {'*', '-', '+'};
        int firstNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
        int secondNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
        int randomOperators = (int) (Math.random() * mathOperators.length);
        char operator = mathOperators[randomOperators];
        int answer = calculateAnswer(firstNum, secondNum, operator);
        var correctAnswer = String.valueOf(answer);
        var questions = STR."\{firstNum} \{operator} \{secondNum}";
        return new String[] {questions, correctAnswer};
    }
    public static int calculateAnswer(int firstNum, int secondNum, char operator) {

        return switch (operator) {
            case '*' -> firstNum * secondNum;
            case '-' -> firstNum - secondNum;
            case '+' -> firstNum + secondNum;
            default -> throw new IllegalStateException(STR."Unexpected value: \{operator}");
        };
    }
    public static void startGame() {
        String gameRules = "What is the result of the expression?";
        var questionsAnswer = new String[Engine.QUESTIONS_COUNT][2];
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            questionsAnswer[i] = generateRoundData();
        }
        Engine.launchGame(gameRules, questionsAnswer);
    }
}
