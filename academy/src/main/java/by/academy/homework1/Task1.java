package by.academy.homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int age;
        System.out.print("Введите возраст: ");
        if (s.hasNextInt()) {
            age = s.nextInt();
            if (age > 0 && age <=100) {
                System.out.print("Введите cумму: ");
                double money = 0;
                if (s.hasNextDouble()) {
                    money = s.nextDouble();
                    if (money >= 0) {
                        if ((money > 0) && (money < 100)) {
                            money = money - (money * 0.05);
                            System.out.println("Сумма покупки с 5% скидкой будет: " + money);
                        } else if ((money >= 100) && (money < 200)) {
                            money = money - (money * 0.07);
                            System.out.println("Сумма покупки с 7% скидкой будет: " + money);
                        } else if ((money >= 200) && (money < 300)) {
                            if (age > 18) {
                                money = money - (money * (0.12 + 0.04));
                                System.out.println("Сумма покупки сo специальной скидкой будет: " + money);
                            } else {
                                money = money - (money * (0.12 - 0.03));
                                System.out.println("Сумма покупки с небольшой скидкой будет: " + money);
                            }
                        } else if ((money >= 300) && (money < 400)) {
                            money = money - (money * 0.15);
                            System.out.println("Сумма покупки с 15% скидкой будет: " + money);
                        } else if (money >= 400) {
                            money = money - (money * 0.2);
                            System.out.println("Сумма покупки с 20% скидкой будет: " + money);
                        } else {
                            System.out.println("Ничего не купили");
                        }
                    } else {
                        System.out.println("Неверный ввод. Сумма должна быть > 0");
                    }
                } else {
                    System.out.println("Неверный ввод. Перезапустите программу и попробуйте снова!");
                }
            } else if (age > 100) {
                System.out.println("Неверный ввод. Доверьте поход в магазин своим внукам!");
            } 
        } else {
            System.out.println("Неверный ввод. Перезапустите программу и попробуйте снова!");
        }
        s.close();
    }

}
