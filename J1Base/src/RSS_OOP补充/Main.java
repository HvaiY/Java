package RSS_OOP补充;

import RSS_OOP补充.abs.Chinese;
import RSS_OOP补充.abs.Person;
import RSS_OOP补充.interfaces.Personable;

public class Main {
	public static void main(String[] args) {
		Person p = new Chinese();
		p.run();
		p.say();
		
		RSS_OOP补充.interfaces.Animal pa=new RSS_OOP补充.interfaces.Chinese();
		pa.eat();
		System.out.println(pa.a);
	
		RSS_OOP补充.interfaces.Chinese	pap=new RSS_OOP补充.interfaces.Chinese();
		pap.eat();
	//	System.out.println(pap.a); 子类对象赋值给子类那么无法明确的知道引用的是哪个接口“继承”过来的字段

		RSS_OOP补充.interfaces.Personable p2 = new RSS_OOP补充.interfaces.Chinese();
		p2.eat();
		p2.say();
		System.out.println(p2.a);

		// 匿名类 （内部内）
		RSS_OOP补充.interfaces.Personable p3 = new Personable() {

			@Override
			public void say() {
				System.out.println("匿名说");

			}

			@Override
			public void eat() {
				System.out.println("瞎吃");

			}
		};
		p3.eat();
		p3.say();

		//
		System.out.println("==============================");

		StaticChunk s = new StaticChunk();
		s.say();

		System.out.println("--------------------");

		// 字符串与 其它类型互转
		int a = 5;
		String str = Integer.toString(a);
		String str2=String.valueOf(a);//建议使用这个将基本数据类型转为字符串
		a = Integer.parseInt(str);
		System.out.println(a);
		System.out.println(str);
		
		System.out.println(String.valueOf(false));//false
 //枚举 
		
		Dir d=Dir.East;
		Dir w=Dir.West;
		Dir e=Dir.East;
		
		System.out.println(d==e);
		System.out.println(w);
		
		switch ("b") {
		case "a":
			System.out.println("a");
			break;

		default:
			break;
		case "b":
			System.out.println("b");
			break;
		}
		
	}

}
