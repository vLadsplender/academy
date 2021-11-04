package by.academy.homework1;

public class Task4 {
    public static void main(String[] args) {
        int result = 1;
        int i =0;
        System.out.println("Возведение числа 2 в степень:");
        System.out.println("Степень 0: Сумма 1");
        do {
            result = result * 2;
            i++;
            System.out.println("Степень " + i + ": Сумма " + result);
        } while (result <= 1_000_000);


    }
}