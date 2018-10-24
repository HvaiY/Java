package R8OOP_Polym;

public class Main {

	public static void main(String[] args) {
		// 多态
		// 父类 ---------子类对象
		Person c = new Chinese();
		c.speak();
		//// 子类对象可以赋值给父类变量
		// 能够调用什么方法取决于 父类
		// 调用那个实现方法取决于对象的类型

		System.out.println("-----------------------");
		
		Person p=getPerson(1);
		p.speak();
		American p2=(American)getPerson(0);
		p2.speak();
		
		//父类 赋值给子类 需要显示的转换
		Chinese ch=(Chinese)p;
		ch.speak();
		
		//不确定一个对象是否是某个对象 可以 先做判断
		System.out.println(getPerson(1) instanceof Chinese );
		System.out.println(getPerson(1) instanceof Person );
		System.out.println(getPerson(2) instanceof Person );
		System.out.println(getPerson(2) instanceof Chinese );  //false
		System.out.println(getPerson(2) instanceof American );
		
				
	}

	public static Person getPerson(int num) {
		if (num == 1) {
			return new Chinese();
		} else {
			return new American();
		}
	}

}
