package R8OOP_Polym;

public class American extends Person {
	@Override
	public void speak() {
		// super.speak();//表示直接使用父类的该方法，那么就没有重写
		System.out.println("我是美国人");
	}
}
