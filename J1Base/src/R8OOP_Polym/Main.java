package R8OOP_Polym;

public class Main {

	public static void main(String[] args) {
		// ��̬
		// ���� ---------�������
		Person c = new Chinese();
		c.speak();
		//// ���������Ը�ֵ���������
		// �ܹ�����ʲô����ȡ���� ����
		// �����Ǹ�ʵ�ַ���ȡ���ڶ��������

		System.out.println("-----------------------");
		
		Person p=getPerson(1);
		p.speak();
		American p2=(American)getPerson(0);
		p2.speak();
		
		//���� ��ֵ������ ��Ҫ��ʾ��ת��
		Chinese ch=(Chinese)p;
		ch.speak();
		
		//��ȷ��һ�������Ƿ���ĳ������ ���� �����ж�
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
