package R8OOP_Polym;

public class Chinese extends Person {
	@Override
	public void speak() {
		System.out.println("我是中国人 ，我会说中国话");
	}

	private void run() {
		System.out.println("中国人向上跑");
	}
}
