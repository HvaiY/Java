package RSS_OOP����;

import RSS_OOP����.abs.Chinese;
import RSS_OOP����.abs.Person;
import RSS_OOP����.interfaces.Personable;

public class Main {
	public static void main(String[] args) {
		Person p = new Chinese();
		p.run();
		p.say();
		
		RSS_OOP����.interfaces.Animal pa=new RSS_OOP����.interfaces.Chinese();
		pa.eat();
		System.out.println(pa.a);
	
		RSS_OOP����.interfaces.Chinese	pap=new RSS_OOP����.interfaces.Chinese();
		pap.eat();
	//	System.out.println(pap.a); �������ֵ��������ô�޷���ȷ��֪�����õ����ĸ��ӿڡ��̳С��������ֶ�

		RSS_OOP����.interfaces.Personable p2 = new RSS_OOP����.interfaces.Chinese();
		p2.eat();
		p2.say();
		System.out.println(p2.a);

		// ������ ���ڲ��ڣ�
		RSS_OOP����.interfaces.Personable p3 = new Personable() {

			@Override
			public void say() {
				System.out.println("����˵");

			}

			@Override
			public void eat() {
				System.out.println("Ϲ��");

			}
		};
		p3.eat();
		p3.say();

		//
		System.out.println("==============================");

		StaticChunk s = new StaticChunk();
		s.say();

		System.out.println("--------------------");

		// �ַ����� �������ͻ�ת
		int a = 5;
		String str = Integer.toString(a);
		String str2=String.valueOf(a);//����ʹ�������������������תΪ�ַ���
		a = Integer.parseInt(str);
		System.out.println(a);
		System.out.println(str);
		
		System.out.println(String.valueOf(false));//false
 //ö�� 
		
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
