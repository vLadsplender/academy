package by.academy.homework.homework2;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Введите слово 1 с четным количеством символов: ");
    String s1 = sc.nextLine();
    if (s1.length() % 2 != 0) {
    	System.out.println("Нечетное количество символов в слове 1. Запустите, пожалуйста, программу занова");
    	return;
    }
    System.out.print("Введите слово 2 с четным количеством символов: ");
    String s2 = sc.nextLine();
    if (s2.length() % 2 != 0) {
        System.out.println("Нечетное количество символов в слове 2. Запустите, пожалуйста, программу занова");
        return;
    }
    StringBuilder sb = new StringBuilder();
    sb.append(s1, 0, s1.length() / 2);
    sb.append(s2, s2.length() / 2, s2.length());
    System.out.println(sb);
    sc.close();
	
	}
}