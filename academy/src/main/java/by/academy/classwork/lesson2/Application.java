package by.academy.classwork.lesson2;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat1 = new Cat("Vasya");
		System.out.print(cat1.getNickname());
		cat1.sleep();
		
		Cat cat2 = new Cat("Виктор", 12, 21);
		System.out.println(cat2);
		cat2.walk();
		
		Cat cat3= new Cat("Кеша", 12, 12.234);
		System.out.print(cat3);
		cat3.eat(); 
		cat3.sleep();
		
		
	}

}
