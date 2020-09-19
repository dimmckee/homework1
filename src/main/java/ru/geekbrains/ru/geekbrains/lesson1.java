package ru.geekbrains.ru.geekbrains;

public class lesson1 {
    public static float calculate(float a, float b, float c, float d) {
        System.out.println(a * (b + (c / d)));
        return a * (b + (c / d));
    }
    public static boolean task10and20(int x1, int x2) {
        int inputAB ( int x1, int x2){
            int sum = x1 + x2;
            if (sum >= 10 && sum <= 20) {
                return true;
            } else {
                return false;
            }

        }
    }
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число " + x + " Положительное");
        } else {
            System.out.println("Число " + x + " Отрицательное");
        }
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void greetings(String name) {
        System.out.println("Привет, " + name + " !");
    }
}
