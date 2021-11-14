package by.academy.homework.homework2;

import java.util.Scanner;

public class Task2 {

	public static void main(String... args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Введите");
	int n = sc.nextInt();

	String[] arr = new String[n];
	for (int i=0; i <n; i++) {
		System.out.println("Введите слово");
		arr[i]=sc.next();
	}
	int minChars= -1;
	String minWord = null;
	
	for (int i = 1; i< n; i++) {
		String s = arr[i];
		arr[i]= sc.next();
		int unique = getUniqueCharQuantity(s);
		if (minWord == null && minChars>unique) {
			minChars = unique;
			minWord = s;
		}
				
	}
	sc.close();
	}
private static int getUniqueCharQuantity(String s); {
	char [] charCounter = new char[256];
	char[] allChars = s.toCharArray();
	for (Character с : s.toCharArray()) {
		charCounter[c]++;
}


}
return 0;
}
