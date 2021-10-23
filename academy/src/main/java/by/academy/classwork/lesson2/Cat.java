package by.academy.classwork.lesson2;

public class Cat {

	String nickname;
	int age;
	double money;

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public Cat(String nickname) {
		super();
		this.nickname = nickname;
	}

	public Cat(String nickname, int age, double money) {
		super();
		this.nickname = nickname;
		this.age = age;
		this.money = money;
		}
	public void sleep() {
		System.out.print(" "+ nickname + " ����");
	}
		
		public void eat() {
			System.out.print (" "+ nickname + " ���");
	}		
		public void walk() {
			System.out.println("���");
	}		

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cat [nickname=");
		builder.append(nickname);
		builder.append(", age=");
		builder.append(age);
		builder.append(", money=");
		builder.append(money);
		builder.append("]");
		return builder.toString();
	}

}
