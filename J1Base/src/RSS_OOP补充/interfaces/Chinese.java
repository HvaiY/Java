package RSS_OOP补充.interfaces;

public class Chinese implements Personable {

	@Override
	public void say() {
		//抽象方法一定在抽象类中 子类必须实现父类抽象方法
		System.out.println("中国人跑的快");
	}

	@Override
	public void eat() {
	System.out.println("瞎吃");
	}

}
