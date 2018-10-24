package R8OOP_Inheritance;

public class Main {
	public static void main(String[] args) {
		// 继承
		Parent p = new Parent();
		p.eat();

		Child child = new Child();
		child.eat();
		child.playGame();

		// private 成员无法被子类访问，子类只能通过父类的非 private 方法“间接”访问父类的
		// private 成员。这样保证了父类 private 成员的安全性。
		// public 成员无论是子类还是其他类都可以访问。
		// protected 成员只能被自己以及子类（直接或者间接）以及兄弟（同 package 包中）访问，
		// 无法被其他类访问
	}
}
