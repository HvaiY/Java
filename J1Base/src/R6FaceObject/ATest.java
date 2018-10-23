package R6FaceObject;

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
			cat.sayHello();
		}
	}

}
