package R6OOP_packaging;

public class ATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 面向对象
		// 对象是类的一个具体实现
		// 类是一类事物的抽象归类 人类 动物类
		// 面向對象 三大特性 继承 封装 多态
		Person person = new Person();
		person.setAge(18);
		person.setName("大海");
		person.sayHello();

		// 实例化一个动物 叫做tom
		Animal cat = new Animal();
		cat.setAge(12);
		cat.setName("Tom");
		cat.sayHello();
		{
			Animal dog = new Animal(12, "旺财");
			System.out.println(dog.getName() + "是一只狗" + dog.getAge() + "岁了");
			dog.sayHello();

			Animal dog1 = new Animal(12, "旺财");
			System.out.println(dog1.getName() + "是一只狗" + dog1.getAge() + "岁了");
			dog1.sayHello();

			System.out.println(dog == dog1);// false 无法判断是同一个对象的
             System.out.println(isSame(dog, dog1)); //true 这种方式判断是否为同一个对象
			System.out.println(dog1.hashCode());
		}

		// public:公共的，都能访问 private：私有的 只能类内部自己才能访问(单例就是构造函数私有化做到的)
		// 成员变量是存储数据用的 一般都是private 修饰
	}

	public static boolean isSame(Animal dog, Animal dog1) {
		return dog.getAge() == dog1.getAge() && dog.getName().equals(dog1.getName());
	}
}
