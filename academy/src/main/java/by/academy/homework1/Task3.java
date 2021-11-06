package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число от 1 до 10: ");
        int n = s.nextInt();
        int result;
        System.out.println("Таблица умножения для числа: " + n);
        for (int i = 1; i <= 10; i++) {
        result = n * i;
        System.out.println(n + "*" + i + " = " + result);
            
        }
    }
}6666666