package by.academy.classwork.lesson1;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");

		int age = 20;
		System.out.println("Age:" + age);

		char c1 = 1001;
		char c2 = 'e';
		

		System.out.println(c1);
		System.out.println(c2);
		System.out.println((int) c1);

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Main []");
		return builder.toString();
	}
	
	
}
