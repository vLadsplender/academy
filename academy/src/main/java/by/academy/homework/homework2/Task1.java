package by.academy.homework.homework2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку 1:");
		String str1 = sc.nextLine().trim();
		System.out.println("Введите строку 2:");
		String str2 = sc.nextLine().trim();
		int count1 = 0;
		int count2 = 0;
		
		if ((str1 != null) && (str2 != null)) {
			if (str1.length() == str2.length()) {
				for (int i = 0; i < str1.length(); i++) {
					char check = str1.charAt(i);
					for (int j = 0; j < str1.length(); j++) {
						if (str1.charAt(j) == check) {
							count1++;
						}
						if (str2.charAt(j) == check) {
							count2++;
						}
					}
					if (count1 != count2) {
						System.out.println("Разная длина строк");
						return;
					}
				}
				System.out.println("Вторая строка является перестановкой символов первой строки");
			} else {
				System.out.println("Вторая строка не является перестановкой символов первой строки");
			}
		} else {
			System.out.println("Строка или строки null!");
			sc.close();
		}
	}
}
