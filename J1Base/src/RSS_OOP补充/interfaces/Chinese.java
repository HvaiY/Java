package RSS_OOP����.interfaces;

public class Chinese implements Animal,Personable {

	@Override
	public void say() {
		//���󷽷�һ���ڳ������� �������ʵ�ָ�����󷽷�
		System.out.println("�й����ܵĿ�");
	}

	@Override
	public void eat() {
	System.out.println("Ϲ��");
	}

}
