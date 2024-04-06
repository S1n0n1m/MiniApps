package by.javaguru;

public class Utils {
    public static int randomGenerator(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
}
