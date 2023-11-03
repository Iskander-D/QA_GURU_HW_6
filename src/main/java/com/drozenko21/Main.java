package com.drozenko21;

public class Main {
    public static void main(String[] args) {
        math();
        System.out.println();
        logic();
        System.out.println();
        overflow();
        System.out.println();
        combination();
    }
    private static void math() {
        int a = 15;
        int b = 7;
        System.out.println("Сумма: a + b = " + (a + b));
        System.out.println("Разность: a - b = " + (a - b));
        System.out.println("Умножение: a * b = " + (a * b));
        System.out.println("Деление: a / b = " + (a / b));
        System.out.println("Остаток от деления: a % b = " + (a % b));
    }
    private static void logic() {
        int a = 15;
        int b = 7;
        System.out.println("Равно: a == b = " + (a == b));
        System.out.println("Не равно: a != b = " + (a != b));
        System.out.println("Больше: a > b = " + (a > b));
        System.out.println("Меньше: a < b = " + (a < b));
        System.out.println("Больше или равно: b >= a = " + (b >= a));
        System.out.println("Меньше или равно: b <= a = " + (b <= a));

    }
    private static void overflow() {
        Long maxLong = Long.MAX_VALUE;
        Long sum = maxLong + 15;
        short aShort = 32_767;
        short bShort = 1;
        short sumShort = (short) (aShort + bShort);

        System.out.println("Переполнение MAX_VALUE: " + sum);
        System.out.println("Переполнение Short: " + sumShort);
    }
    private static void combination() {
        int a = 15;
        double b = 1.5;
        double sumDouble = a + b;
        double differenceDouble = a - b;
        double productDouble = a * b;
        double quotientDouble = a / b;

        int sumInt = (int) (a + b);
        int differenceInt = (int) (a - b);
        int productInt = (int) (a * b);
        int quotientInt = (int) (a / b);

        System.out.println("Сумма: " + sumDouble);
        System.out.println("Разность: " + differenceDouble);
        System.out.println("Умножение: " + productDouble);
        System.out.println("Деление: " + quotientDouble);
        System.out.println("Сумма: " + sumInt);
        System.out.println("Разность: " + differenceInt);
        System.out.println("Умножение: " + productInt);
        System.out.println("Деление: " + quotientInt);
    }
}