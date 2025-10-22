package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово для проверки палиндрома: ");
        String word = scanner.nextLine();
        System.out.println("Это палиндром: " + isPalindrome(word));
    }
    // Заглушка для варианта 9
    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    // Заглушка для варианта 6
    public static int maxOfThree(int a, int b, int c) {
        return 0;
    }

    // Заглушки для варианта 1
    public static double add(double a, double b) {
        return 0;
    }
    public static double subtract(double a, double b) {
        return 0;
    }
    public static double multiply(double a, double b) {
        return 0;
    }
    public static double divide(double a, double b) {
        return 0;
    }
}