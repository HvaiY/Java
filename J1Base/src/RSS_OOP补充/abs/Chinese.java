package RSS_OOP补充.abs;

public class Chinese extends Person {

	@Override
	public void run() {
		//抽象方法一定在抽象类中 子类必须实现父类抽象方法
		System.out.println("中国人跑的快");
	}

}
