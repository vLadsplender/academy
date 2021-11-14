package by.academy.homework.homework2;

import java.util.Random;
import java.util.Scanner;

public class Deal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество игроков:");
		int p = sc.nextInt();
		int hand = 5;
		String[] deck = { 
				"2 (Пики)", "3 (Пики)", "4 (Пики)", "5 (Пики)", "6 (Пики)", "7 (Пики)", "8 (Пики)", "9 (Пики)", "10 (Пики)", "В (Пики)", "Д (Пики)", "К (Пики)", "Т (Пики)",  
				"2 (Крести)", "3 (Крести)", "4 (Крести)", "5 (Крести)", "6 (Крести)", "7 (Крести)", "8 (Крести)", "9 (Крести)", "10 (Крести)", "В (Крести)", "Д (Крести)", "К (Крести)", "Т (Крести)",
				"2 (Черва)", "3 (Черва)", "4 (Черва)", "5 (Черва)", "6 (Черва)", "7 (Черва)", "8 (Черва)", "9 (Черва)", "10 (Черва)", "В (Черва)", "Д (Черва)", "К (Черва)", "Т (Черва)",
				"2 (Бубна)", "3 (Бубна)", "4 (Бубна)", "5 (Бубна)", "6 (Бубна)", "7 (Бубна)", "8 (Бубна)", "9 (Бубна)", "10 (Бубна)", "В (Бубна)", "Д (Бубна)", "К (Бубна)", "Т (Бубна)"
				};
		String[] result = new String[hand];
		String[][] playerCard = new String[p][result.length];
		int length = deck.length;
		Random random = new Random();
		int min = 0;
		int max = 51;
		int diff = max - min;

		System.out.println();
		if (p > ((int) deck.length / hand)) {
			System.out.println("Возможное количество игроков: от 1 до 10. Запустите программу повторно.");
			System.exit(1);
		}
		if (p < 1) {
			System.out.println("Возможное количество игроков: от 1 до 10Запустите программу повторно.");
			System.exit(1);
		}

		for (int i = 0; i < deck.length; i++) {
			int index = random.nextInt(i + 1);
			String a = deck[index];
			deck[index] = deck[i];
			deck[i] = a;
		}

		for (int i = 0; i < playerCard.length; i++) {
			for (int j = 0; j < playerCard[i].length; j++) {
				int randomCard = random.nextInt(diff + 1);
				result[j] = deck[randomCard];
				deck[randomCard] = deck[length - 1];
				length--;
				diff--;

				playerCard[i][j] = result[j];
			}
		}

			for (int i = 0; i < playerCard.length; i++) {
			System.out.println("Игрок " + (i + 1)+":");
			for (int j = 0; j < playerCard[i].length; j++) {
				System.out.println(playerCard[i][j]);
			}
			System.out.println("");
			System.out.println();
		}
		sc.close();
	}
}